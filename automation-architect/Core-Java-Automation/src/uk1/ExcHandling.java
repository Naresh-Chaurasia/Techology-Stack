import java.lang.Exception;

public class ExcHandling {
    public static void main(String[] args) {
    
        String name = null;

        try{
            System.out.println(name.length());
        }catch(Exception e){
            System.out.println(e.toString());
        }


    
    }
}