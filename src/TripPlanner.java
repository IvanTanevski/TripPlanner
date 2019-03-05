import java.util.*;

public class TripPlanner {
    public static void main (String[] args) {
        greetingUser();
        numbers();
        timeDifference();
        area();
    }
    public static void greetingUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("Whats is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you meet you " + name + ", where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip.");
        System.out.println("***************");
        System.out.println();
    }
    public static void numbers(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in one USD? ");
        double exchangeRate = input.nextDouble();
        System.out.println();
        System.out.println("If you are travelling for " + days + " that is the same as " + days*24 + " hours or " +
                days*24*60 + " minutes.");
        System.out.println("If you are going to spend $" + money + " USD that means per day you can spend up to $" +
                ((int)((double)money/days*100)) /100.0 + " USD.");
        System.out.println("Your total budget in " + currency + " is " + money*exchangeRate + " " + currency +
                ", which per day is " + ((int)(money*exchangeRate/days*100))/100.0 + " " + currency);
        System.out.println();
    }
    public static void timeDifference(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDiff = input.nextInt();
        System.out.println("That means that when is midnight at home it will be " + timeDiff + ":00 in your travel destination " +
                "and when it's noon at home it will be " + (12+timeDiff) + ":00");
        System.out.println("***************");
        System.out.println();
    }
    public static void area(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int destinationArea = input.nextInt();
        System.out.println("In miles2 that is " + ((int)(destinationArea/2.59*100))/100.0);
        System.out.println("***************");
        System.out.println();
    }
}
