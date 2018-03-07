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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //tell person to enter their name
        System.out.print("Please enter your name:");
        String name = input.nextLine();
        
        System.out.print("What was the first test out of?:");
        int totalOne = input.nextInt();
        
        System.out.print("What mark did you get?:");
        int gradeOne = input.nextInt();
        
        System.out.print("What was the second test out of?:");
        int totalTwo = input.nextInt();
        
        System.out.print("What mark did you get?:");
        int gradeTwo = input.nextInt();
        
        System.out.print("What was the third test out of?:");
        int totalThree = input.nextInt();
        
        System.out.print("What mark did you get?:");
        int gradeThree = input.nextInt();
        
        System.out.print("What was the fourth test out of?:");
        int totalFour = input.nextInt();
        
        System.out.print("What mark did you get?:");
        int gradeFour = input.nextInt();
        
        System.out.print("What was the fifth test out of?:");
        int totalFive = input.nextInt();
        
        System.out.print("What mark did you get?:");
        int gradeFive = input.nextInt(); 
        
        System.out.println("Test scores for" + " " + name);
        
        int testOneAverage = (totalOne + gradeOne) / 2;
        System.out.println("Test 1:" + " " + testOneAverage);
        
        int testTwoAverage = (totalTwo + gradeTwo) / 2;
        System.out.println("Test 2:" + " " + testTwoAverage);
        
        int testThreeAverage = (totalThree + gradeThree) / 2;
        System.out.println("Test 3:" + " " + testThreeAverage);
        
        int testFourAverage = (totalFour + gradeFour) / 2;
        System.out.println("Test 4:" + " " + testFourAverage);
        
        int testFiveAverage = (totalFive + gradeFive) / 2;
        System.out.println("Test 5:" + " " + testFiveAverage);
        
        int totalAverage = (testOneAverage + testTwoAverage + testThreeAverage + testFourAverage + testFiveAverage) / 5;
        System.out.println("Average:" + " " + totalAverage);
        
        
        
    }
    
}
