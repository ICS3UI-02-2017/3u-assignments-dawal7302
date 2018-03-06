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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tell the person to enter 4 numbers on seperate lines
        System.out.println("Please enter 4 numbers on seperate lines:");
        
        //use a scanner to read information
        Scanner input = new Scanner(System.in);
       
        //make the variables to store numbers
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int numberThree = input.nextInt();
        int numberFour = input.nextInt();
        
        System.out.println("Your numbers were" + " " +  numberOne + ", " + numberTwo + ", " + numberThree + ", and " + numberFour);
        
        
                
    }
    
}
