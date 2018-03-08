/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author leendawamneh
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to store information
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Enter sum of dice:");
        int sumOfDiceOne = input.nextInt();
        int squareNumberOne = 1 + sumOfDiceOne;
        System.out.println("You are now on square" + " " + squareNumberOne);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceTwo = input.nextInt();
        int squareNumberTwo = 10 + sumOfDiceTwo;
        System.out.println("You are now on square" + " " + squareNumberTwo);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceThree = input.nextInt();
        int squareNumberThree = 21 + sumOfDiceThree;
        System.out.println("You are now on square" + " " + squareNumberThree);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceFour = input.nextInt();
        int squareNumberFour = 57 + sumOfDiceFour;
        System.out.println("You are now on square" + " " + squareNumberFour);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceFive = input.nextInt();
        int squareNumberFive = 83 + sumOfDiceFive;
        System.out.println("You are now on square" + " " + squareNumberFive);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceSix = input.nextInt();
        int squareNumberSix = 86 + sumOfDiceSix;
        System.out.println("You are now on square" + " " + squareNumberSix);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceSeven = input.nextInt();
        int squareNumberSeven = 81 + sumOfDiceSeven;
        System.out.println("You are now on square" + " " + squareNumberSeven);
        
        System.out.print("Enter sum of dice:");
        int sumOfDiceEight = input.nextInt();
        int squareNumberEight = 91 + sumOfDiceEight;
        System.out.println("You are now on square" + " " + squareNumberEight);
        
        System.out.println("You win!");
        }
    }
    
    

