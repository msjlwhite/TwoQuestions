/*
Author: J White
Date: 4/18/2019
Task: Make a program which plays a simple game of 20 2 Questions. The first question should be "animal,
vegetable, or mineral?" Then, the second question should be "is it bigger than a breadbox?" Then, display one of
six possible responses, depending on their answers. You can choose what answers to give for each of the six
possibilities.
*/

package com.company;

// imports the java class scanner
import java.util.Scanner;

// class that contains the 2 Questions game
public class Inquiry {

    //Class variable and object declaration
    String ans;                                 // holds the user's response to the first question
                                                // of the game
    String ans2;                                // holds the user's response to the first question
                                                // of the game
    Scanner scanner = new Scanner(System.in);   // reads in the user's input from the cursor

    //greets user then explains how to play the game
    public void questions(){

        System.out.println("Welcome to Ask-away Q and A!");
        System.out.println("This program is a simple game of 20, no, 2 Questions. Where we will try to guess what ");
        System.out.println("object you are thinking of.");
        System.out.println("Please answer the following questions:");
        System.out.println("");

        // asks the user if the object that they are thinking of is animal, vegetable or mineral
        System.out.println("Q1: Is it animal, vegetable, or mineral?");
        ans = scanner.nextLine().toLowerCase();

        // asks the user about the size of the object that they are thinking of
        System.out.println("Q2: Is it bigger than a breadbox?");
        ans2 = scanner.nextLine().toLowerCase();

        System.out.println("");

        //Will print out the following messages depending on the user's responses to
        //the above questions
        // If yes, bigger than breadbox this happens . . . .
        if (ans2.equals("yes")){
            if(ans.equals("animal")){
                System.out.println("Big animal test ...");
            }else if(ans.equals("vegetable")){
                System.out.println("Big veggie test ...");
            }else{
                System.out.println("Big mineral test ...");
            }// end
        }else if(ans2.equals("no")){
            // no smaller than or equal to in size of breadbox then this happens
            if(ans.equals("animal")){
                System.out.println("Small Animal test");
            }else if(ans.equals("vegetable")){
                System.out.println("Small Veggie Test");
            }else{
                System.out.println("Small Mineral Tes");
            }
        }else {
            System.out.println("I HAVE NO IDEA what you're thinking of and apparently neither" +
                    " do you BUT GOOD LUCK WITH THAT");
        }

    }// end of questions method


}//end of Inquiry Class
