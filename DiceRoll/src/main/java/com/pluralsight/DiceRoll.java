package com.pluralsight;
import java.util.*;
public class DiceRoll {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Dice dice = new Dice();
        String userInput = "";
        // Goal: Make a application that replicates rolling 2 random dice (aka gambling app)
        int twoRolls = 0, fourRolls = 0, sixRolls = 0, sevenRolls = 0;
        int roll1 = random.nextInt(6);
        int roll2 = random.nextInt(6);

   // A loop should be made for the user to return to the main menu if they wish to if not it exits the program
      System.out.println("Welcome to the Dice Roller!");
      System.out.println("Please Type R to Start!\n"+  "Note: This Application will record everytime the sum is 2, 4, 6, and 7.");
        String userChoice = scanner.nextLine();
//Will have to use an if statement to make sure the user says roll


        for (int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int total = roll1 + roll2;
            System.out.println("1st Dice : "+ roll1 +" \n2nd Dice : "+ roll2 + "\nSum: "+total );
            twoRolls += (total == 2) ? 1 : 0;
            fourRolls += (total == 4) ? 1 : 0;
            sixRolls += (total == 6) ? 1 : 0;
            sevenRolls += (total == 7) ? 1 : 0;



        } System.out.printf("""
    \nResults:
    2 rolls: %d
    4 rolls: %d
    6 rolls: %d
    7 rolls: %d""", twoRolls, fourRolls, sixRolls, sevenRolls);
    }







    }















