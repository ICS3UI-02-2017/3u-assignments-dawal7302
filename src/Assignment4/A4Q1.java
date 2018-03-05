/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author leendawamneh
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a Scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name");
        //make a String to store a name
        String name = input.nextLine();
        
        //say hello how are you?
        System.out.println("Hello " + name + ". How are you today?");
                
        
        
    }
    
}
