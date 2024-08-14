
package uk1;

public class WhatIsMethod {
    public static void main(String[] args) {
        System.out.println("Hello...");

       String val = makeCoffee(10);
       System.out.println(val);

    }

    static String makeCoffee(int water){
       
        System.out.println("--------");
        System.out.println("Warm water"+water);
        System.out.println("add coffee");
        System.out.println("add sugar");
        System.out.println("add milk");

        return "coffee";
    }

}
