package debug;

import java.util.HashMap;
import java.util.Set;

public class AList {
    public static void main(String[] args) {

       // Creating a HashMap to store student names and their scores
       HashMap<String, String> student = new HashMap<String, String>();
       student.put("100", "chaitali");
       student.put("200", "naresh");

       System.out.println(student);

       String name = student.get("200");
       System.out.println(name);

        
    }
}
