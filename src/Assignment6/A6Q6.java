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
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to store information
        Scanner input = new Scanner(System.in);
        
        //ask user how many students there are 
        System.out.println("How many students are in the class?");
        int numberOfStudents = input.nextInt();
        System.out.println("Enter the marks of the class");
        int [] marks = new int [numberOfStudents];
        int lowestMark = input.nextInt();
        int highestMark = input.nextInt();
        int averageMark = input.nextInt();
        
        
    }
    
}
