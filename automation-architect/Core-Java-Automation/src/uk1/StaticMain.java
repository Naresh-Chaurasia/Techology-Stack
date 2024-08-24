package uk1;

class StaticMain{
    public static void main(String[] args) {
        StaticExample s1 = new StaticExample();
        s1.student = "Punit";
        s1.teacher ="Naresh";
        

        s1.display();

        StaticExample s2 = new StaticExample();
        s2.student = "Manish";

        s2.display();

        System.out.println(s2.teacher);

        s2.teacher = "NC2";

        System.out.println(s1.teacher);
    }
}