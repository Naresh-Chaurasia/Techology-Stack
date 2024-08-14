package uk1;

public class SwitchCase {
    public static void main(String[] args) {

        String dayOfWeek = "Monday";

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Start of the work week!");
                break;
            case "Tuesday":
                System.out.println("Second day of the work week.");
                break;
            case "Wednesday":
                System.out.println("Midweek day.");
                break;
            case "Thursday":
                System.out.println("Almost the weekend.");
                break;
            case "Friday":
                System.out.println("End of the work week!");
                break;
            case "Saturday":
                System.out.println("Weekend day.");
                break;
            case "Sunday":
                System.out.println("Weekend day.");
                break;
            default:
                System.out.println("Not a valid day.");
                break;
        
    }
}
