package india1;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c = 0;
        System.out.println( "Hello World!" );


        try{
            System.out.println("Before division...");
            c = a/b;
            System.out.println("After division...");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }

        

        System.out.println( c );

        System.out.println( "I am fine. How are you !!!" );
    }
}
