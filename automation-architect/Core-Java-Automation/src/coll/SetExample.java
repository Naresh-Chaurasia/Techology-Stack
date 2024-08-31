package coll;

import java.util.HashSet;

public class SetExample {
    public static void main(String[] args) {
        
        HashSet <String> cities = new HashSet<String>();

        // Adding elements to the HashSet
        cities.add("New York");
        cities.add("Los Angeles");
        cities.add("Chicago");
        cities.add("New York");

        System.out.println(cities);

        // Iterating over the HashSet
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
