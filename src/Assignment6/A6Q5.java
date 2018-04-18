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
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to store information
        Scanner input = new Scanner(System.in);
        
        //ask user how many marks there are and to enter them
        System.out.println("How many marks are there?");
        int numberOfMarks = input.nextInt();
        System.out.println("Please enter the marks");
        int [] marks = new int [numberOfMarks];
        int allMarks = input.nextInt();
                int markMedianOne = input.nextInt();
                int markMedianTwo = input.nextInt();               
                int averageMedian = markMedianOne + markMedianTwo /2;
                System.out.println("The median of the marks is" + " " + averageMedian);
    }
    
}
