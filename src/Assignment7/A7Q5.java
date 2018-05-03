/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

/**
 *
 * @author leendawamneh
 */
public class A7Q5 {
    public static void chaotic(int numberOfLines) {
        int randNumOne = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("**");
        int randNumTwo = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("**");
        int randNumThree = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("****");
        int randNumFour = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("****");
        int randNumFive = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("***");
        int randNumSix = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("***");
        int randNumSeven = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("*");
        int randNumEight = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("****");
        int randNumNine = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("*****");
        int randNumTen = (int)(Math.random()*(5 - 1 + 1))+ 1;
        System.out.println("****");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //print out the random number of asterisks
        chaotic(10);
    }
    
}
