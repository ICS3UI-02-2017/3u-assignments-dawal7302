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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        //tell the person to enter the speed limit
        System.out.print("Enter the speed limit:");
        int speedLimit = input.nextInt();
        System.out.print("Enter the recorded speed of the car:");
        int carSpeed = input.nextInt();
        //if the speed is above the speed limit there is a fine
        if(carSpeed <= speedLimit) {
            System.out.print("Congradulations, you are within the speed limit!");           
        } else if(speedLimit <= carSpeed) {
            System.out.print("You are speeding!");
        }
        
    }
    
}
