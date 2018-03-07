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
        
        
        //make integers for the costs
        System.out.print("How much does the food for prom cost?:");
        int costOne = input.nextInt();
        
        System.out.print("How much does the DJ cost?:");
        int costTwo = input.nextInt();
        
        System.out.print("How much does it cost to rent the hall?:");
        int costThree = input.nextInt();
        
        System.out.print("How much does decoration cost?:");
        int costFour = input.nextInt();
        
        System.out.print("How much does it cost for staff?:");
        int costFive = input.nextInt();
        
        System.out.print("How much for miscellaneous costs?:");
        int costSix = input.nextInt();
        
        
        int totalCost = costOne + costTwo + costThree + costFour + costFive + costSix;
        int numberOfTickets = totalCost / 35;
        
        System.out.println("The total cost is" + " " + "$" + totalCost + ". You will ned to sell" + " " + numberOfTickets + " number of tickets to break even.");
                
        
        
        
    }
    
}
