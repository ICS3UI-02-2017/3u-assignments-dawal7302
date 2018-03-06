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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //use a scanner to read information
        Scanner input = new Scanner(System.in);
        int costOne = input.nextInt();
        System.out.println("How much does the food for prom cost?:" + costOne);
        
        int costTwo = input.nextInt();
        System.out.println("How much does the DJ cost?:" + costTwo);
        
        int costThree = input.nextInt();
        System.out.println("How much does it cost to rent the hall?:" + costThree);
        
        int costFour = input.nextInt();
        System.out.println("How much does decoration cost?:" + costFour);
        
        int costFive = input.nextInt();
        System.out.println("How much does it cost for staff?:" + costFive);
        
        int costSix = input.nextInt();
        System.out.println("How much for miscellaneous costs?:" + costSix);
        
        int totalCost = costOne + costTwo + costThree + costFour + costFive + costSix;
        int numberOfTickets = totalCost / 35;
        
        System.out.println("The total cost is" + " " + "$" + totalCost + ". You will ned to sell" + numberOfTickets );
                
        
        
        
    }
    
}
