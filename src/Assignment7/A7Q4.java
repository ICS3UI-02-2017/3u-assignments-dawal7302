/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author leendawamneh
 */
public class A7Q4 {
    public static double initial(double p, double r, double n) {
        double interestRate = 1+r;
        double initialAmount = p;
        double balance =  initialAmount * (Math.pow(interestRate, n));
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //calculate the balance
        double balance = initial(3,4,5);
        System.out.println("The new balance of the account is " + balance);
    }
    
}
