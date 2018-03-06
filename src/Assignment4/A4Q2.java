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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the measurement in inches you wish to convert:");
               
        //use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //make a variable to store centimenters
        int measurementInInches = input.nextInt();
        double num = 2.54;
        double measurementInCentimeters =  2.54 * measurementInInches;
        
        System.out.println(measurementInInches + " inches is the same as " + measurementInCentimeters + " centimeters.");
        
    }
    
}
