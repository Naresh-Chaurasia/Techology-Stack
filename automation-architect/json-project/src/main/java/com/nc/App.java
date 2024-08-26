package com.nc;

import com.jayway.jsonpath.JsonPath;

public class App {
    public static void main(String[] args) {
        String json = "{ \"store\": { \"book\": [ { \"category\": \"fiction\", \"title\": \"The Unplugged Alpha\", \"author\": \"Richard Cooper\", \"price\": 8.99 }, { \"category\": \"non-fiction\", \"title\": \"12 Rules for Life\", \"author\": \"Jordan Peterson\", \"price\": 12.99 } ] } }";

        // Extract the title of the first book
        String title = JsonPath.parse(json).read("$.store.book[0].title");
        System.out.println("Title: " + title);
    }
}
