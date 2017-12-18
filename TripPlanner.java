/*
Module Project - Trip Planner

For this project, you are going to write a program
that asks the user for some information about an international trip they are taking.
Based on that information you will need to do some conversions,
using the correct data types, to tell them some information to help them plan their trip.
*/
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        intro();
        budget();
        time();
        area();
        distance();
    }

    public static void intro() {
        System.out.print("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        Scanner input0 = new Scanner(System.in);
        String name = input0.next();
        System.out.print("NIce to meet you, " + name + ". Where are you traveling to? ");
        Scanner input1 = new Scanner(System.in);
        String destination = input1.next();
        System.out.println("Great! " + destination + " sounds like a great trip.\n***********\n");
    }

    public static void budget() {
        // inputs
        System.out.print("How many days are you going to spend traveling? ");
        Scanner input0 = new Scanner(System.in);
        int duration = input0.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        Scanner input1 = new Scanner(System.in);
        double budget = input1.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        Scanner input2 = new Scanner(System.in);
        String currency = input2.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        Scanner input3 = new Scanner(System.in);
        double rate = input3.nextDouble();
        // outputs
        System.out.println("If you are traveling for " + duration + " days, that is the same as " + (duration*24) + " hours or " + (duration*24*60) + " minutes.");
        System.out.println("If you are going to spend $" + budget + " USD that means per-day you can spend up to $" + (budget/duration) + " USD.");
        System.out.println("Your total budget in " + currency + " is " + (budget*rate) + " " + currency + ", which per day is " + (budget*rate/duration) + " " + currency + ".\n***********\n");
    }

    public static void time() {
        // input
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        Scanner input0 = new Scanner(System.in);
        int time = input0.nextInt();
        // output
        System.out.println("That means that when it is midnight at home, it will be " + (time%24) + ":00 in your travel destination,");
        System.out.println("and when it is noon at home, it will be " + ((12+time)%24) + ":00.\n***********\n");
    }

    public static void area() {
        // input
        System.out.print("What is the square area of your destination country in km^2? ");
        Scanner input0 = new Scanner(System.in);
        double area_km2 = input0.nextDouble();
        // output
        double doubleX100 = area_km2/(Math.pow(1.609, 2))*100;
        int intX100 = (int)doubleX100;
        int area_miles2 = intX100/100;
        System.out.println("In miles^2, that is " + area_miles2 + ".\n***********\n");
    }

    public static void distance() {
        // input
        System.out.print("What is the latitude (where W = negative, and E = positive) of your home? ");
        Scanner input0 = new Scanner(System.in);
        double phi1 = Math.toRadians(input0.nextDouble()); // phi1
        System.out.print("What is the longitude (where S = negative, and N = positive) of your home? ");
        Scanner input1 = new Scanner(System.in);
        double lamda1 = Math.toRadians(input1.nextDouble()); // lamda1
        System.out.print("What is the latitude (where W = negative, and E = positive) of your destination? ");
        Scanner input2 = new Scanner(System.in);
        double phi2 = Math.toRadians(input2.nextDouble()); //phi2
        System.out.print("What is the longitude (where S = negative, and N = positive) of your? destination? ");
        Scanner input3 = new Scanner(System.in);
        // output
        double lamda2 = Math.toRadians(input3.nextDouble()); // lamda2
        double hav_phi = Math.pow(Math.sin((phi2-phi1)/2), 2);
        double hav_lamda = Math.pow(Math.sin((lamda2-lamda1)/2), 2);
        double doubleX100 = 2*6371*Math.asin(Math.pow((hav_phi+Math.cos(phi1)*Math.cos(phi2)*hav_lamda), 0.5))*100;
        int intX100 = (int)doubleX100;
        int dist = intX100/100;
        System.out.println("The distance between home and destination is " + dist + "km or " + (dist/1.609) + "miles.");
    }
}
