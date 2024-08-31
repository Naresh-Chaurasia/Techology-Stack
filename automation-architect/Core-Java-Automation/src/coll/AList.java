package coll;

import java.util.ArrayList;

public class AList {

    public static void main(String[] args) {
        
        ArrayList <String> fruits = new ArrayList<String>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        //System.out.println(fruits);

        for(int i=0;i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }


        System.out.println(fruits.isEmpty());

        System.out.println(fruits.indexOf("apple"));

        System.out.println(fruits);
        fruits.remove(0);

        System.out.println(fruits);
    }
    
}
