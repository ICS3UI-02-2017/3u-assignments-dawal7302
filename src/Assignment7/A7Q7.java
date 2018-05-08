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
public class A7Q7 {
    public static int firstDigit(int a){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter any number");
        int number = input.nextInt();
        while (a > 9) {
        a /= 10;
        return a;
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
