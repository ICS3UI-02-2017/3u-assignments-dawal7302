/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment6;

import static java.util.Collections.swap;
import java.util.Scanner;
import static sun.security.krb5.internal.KDCOptions.with;

/**
 *
 * @author leendawamneh
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to store information
        Scanner input = new Scanner(System.in);
        
        //ask user to enter 10 marks
        System.out.println("Please enter 10 marks");
        int [] marks = new int[10];
        marks[0] = input.nextInt();
        marks [1] = input.nextInt();
        marks [2] = input.nextInt();
        marks [3] = input.nextInt();
        marks [4] = input.nextInt();
        marks [5] = input.nextInt();
        marks [6] = input.nextInt();
        marks [7] = input.nextInt();
        marks [8] = input.nextInt();
        marks [9] = input.nextInt();
        
        for(int x = 0; x <= 8; x++){
            for (int y = x + 1; y < marks.length; y++) {
                while (marks[x] > marks[y]); {
                System.out.println(marks[x] + marks [y]);
                
                
                    
                }
                
                
            }
        }
        
  
        
        
    }
    
}
