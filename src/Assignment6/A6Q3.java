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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //ask user to enter two intgers
        System.out.print("Enter two integers:");
        int integerOne = input.nextInt();
        int integerTwo = input.nextInt();
        
        //enter the two intgers in ascending order
        System.out.println("The integers in ascending order are " + integerTwo + " " + integerOne);
    }
    
}
