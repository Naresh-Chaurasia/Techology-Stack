package coll;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap <String, String> hm = new HashMap<String, String>();


        hm.put("100", "NC");

        hm.put("200", "Punit");

        hm.put("300", "Punit");

     

        System.out.println(hm);

        String val = hm.get("100");
        System.out.println(val);

        String no_val = hm.get("200");
        System.out.println(no_val);

    }
}
