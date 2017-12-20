/*
For this project you are going to program a game called "Odds and Evens".
The game is similar to rock paper scissors.
It is played between two players, in your version it will be you versus the computer.
Each player will choose either "odds" or "evens", since you’re playing the computer you will get first pick.
Once you have chosen your side, you each choose a number of fingers to play- 0 to 5.
The winner is determined by whether the sum of your fingers is odd or even (depending on what you chose).
Here's a clip of the game being played: https://youtu.be/4ZOLs03vILs?t=1m
 */

import java.util.*;

public class OddsAndEvens {
    public static void main(String[] args) {
        System.out.println("Let’s play a game called “Odds and Evens”");
        System.out.print("What is your name? ");
        Scanner input0 = new Scanner(System.in);
        String name = input0.next();
        // Part 1 - Pick odds or evens
        System.out.print("Hi " + name +", which do you choose? (O)dds or (E)vens? ");
        Scanner input1 = new Scanner(System.in);
        String choose = input1.next().toUpperCase();
        if (choose.equals("O")) {
            ;
        }
        else if (choose.equals("N")) {
            ;
        }
        else {
            System.out.println("Invalid answer!");
            System.out.print("Hi " + name + ", which do you choose? (O)dds or (E)vens?");
            Scanner input2 = new Scanner(System.in);
            choose = input2.next().toUpperCase();
        }
        if (choose.equals("O")) {
            System.out.println(name + " has picked odds! The computer will be evens.");
        }
        else {
            System.out.println(name + " has picked evens! The computer will be odds.");
        }
        System.out.println("--------------------------------------------\n");
        // Part 2 - Play the Game
        System.out.print("How many “fingers” do you put out? ");
        Scanner input3 = new Scanner(System.in);
        int user = input3.nextInt();
        Random rand = new Random();
        int computer = rand.nextInt(6); // not including 6 therefore is a hand of 5 or less
        System.out.println("The computer plays " + computer + "\"fingers\".");
        System.out.println("--------------------------------------------\n");
        int sum = user + computer;
        System.out.println(user + " + " + computer + " = " + sum);
        // Part 3 - Who won?
        if (sum%2 == 0) {
            System.out.println(sum + " is ... even!");
            if (choose.equals("E")) {
                System.out.println("That means " + name + " wins! :)");
            }
            else {
                System.out.println("That means the computer wins. :(");
            }
        }
        else {
            System.out.println(sum + " is ... odd!");
            if (choose.equals("O")) {
                System.out.println("That means " + name + " wins! :)");
            }
            else {
                System.out.println("That means the computer wins. :(");
            }
        }
        System.out.println("--------------------------------------------\n");
    }
}
