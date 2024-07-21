# %% [markdown]
# ### Inserting the Embeddings into a Pinecone Index

# %%
# I'm importing the necessary libraries and initializing the Pinecone client
import os
import pinecone

from langchain_community.vectorstores import Pinecone

# %%
from dotenv import load_dotenv
# Load environment variables from the .env file
load_dotenv()

# %%
pc = pinecone.Pinecone()

# %%
indexes = pc.list_indexes().names()

# %%
print(indexes)

# %%
# creating an index
from pinecone import ServerlessSpec
index_name = 'churchill-speech'
if index_name not in pc.list_indexes().names():
    print(f'Creating index {index_name}')
    pc.create_index(
        name=index_name,
        dimension=1536,
        metric='cosine',
        spec=ServerlessSpec(
            cloud="aws",
            region="us-east-1"
        )
    )
    print('Index created! 😊')
else:
    print(f'Index {index_name} already exists!')

# %%
from langchain.text_splitter import RecursiveCharacterTextSplitter

with open('churchill_speech.txt') as f:
    churchill_speech = f.read()

# %%
text_splitter = RecursiveCharacterTextSplitter(
    chunk_size=100,
    chunk_overlap=20,
    length_function=len
)

# %%
chunks = text_splitter.create_documents([churchill_speech])

# %%
from langchain_openai import OpenAIEmbeddings
embeddings = OpenAIEmbeddings(model='text-embedding-3-small', dimensions=1536)  # 512 works as well

# %%
# processing the input documents, generating embeddings using the provided `OpenAIEmbeddings` instance,
# inserting the embeddings into the index and returning a new Pinecone vector store object.
vector_store = Pinecone.from_documents(chunks, embeddings, index_name=index_name)

# %%
index = pc.Index(index_name)
index.describe_index_stats()

# %%
query = 'Where should we fight?'
result = vector_store.similarity_search(query)
print(result)

# %%
for r in result:
    print(r.page_content)
    print('-' * 50)

# %%
from langchain.chains import RetrievalQA
from langchain_openai import ChatOpenAI

# Initialize the LLM with the specified model and temperature
llm = ChatOpenAI(model='gpt-3.5-turbo', temperature=0.2)

# Use the provided vector store with similarity search and retrieve top 3 results
retriever = vector_store.as_retriever(search_type='similarity', search_kwargs={'k': 3})

# Create a RetrievalQA chain using the defined LLM, chain type 'stuff', and retriever
chain = RetrievalQA.from_chain_type(llm=llm, chain_type='stuff', retriever=retriever)

# %%
query = 'Answer only from the provided input. Where should we fight?'
answer = chain.invoke(query)

# %%
print(answer)


