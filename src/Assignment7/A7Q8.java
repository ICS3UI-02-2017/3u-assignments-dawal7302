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
public class A7Q8 {
    public static int allDigitsOdd (int number) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberOne = input.nextInt();
        if(numberOne % 2 ==0){
            System.out.println("The number is even");
            if(numberOne % 2 > 0){
                System.out.println("The number is odd");
       
        
            }
        }
        return numberOne;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
