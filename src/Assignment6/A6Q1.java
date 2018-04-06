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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read information
        Scanner input = new Scanner(System.in);
       
        //ask the user to enter how many students in the class and their marks
        System.out.print("How many students in the class?");
        int numberOfStudents = input.nextInt();
        System.out.print("Enter the marks:");
        int markOne = input.nextInt();
        int markTwo = input.nextInt();
        int markThree = input.nextInt();
        
        
        //add all of the marks and divide by number of students
        int totalMarks = markOne + markTwo + markThree;
        int average = totalMarks/numberOfStudents;
        
        System.out.println("The class average is " + average + "%");
       
        
    }
    
}
