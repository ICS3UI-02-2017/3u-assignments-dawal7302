/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import java.util.Scanner;

/**
 *
 * @author leendawamneh
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read information
        Scanner input = new Scanner(System.in); 
        
        //ask user to enter how many people are measuring heights
        System.out.print("How many people are there?");
        int numberOfPeople = input.nextInt();
        System.out.println("What are their heights?");
        int heights = input.nextInt();
        int heightOne = input.nextInt();
        int heightTwo = input.nextInt();
        int heightThree = input.nextInt();
        int heightFour = input.nextInt();
        int heightFive = input.nextInt();
        int totalHeights = heightOne + heightTwo + heightThree + heightFour + heightFive;
        int averageHeights = totalHeights/5;
        System.out.println("The average height is " + averageHeights);
        
        
        
        
        
        
    }
    
}
