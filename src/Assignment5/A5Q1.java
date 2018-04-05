/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5;

import java.util.Scanner;

/**
 *
 * @author leendawamneh
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // use a scanner to read info
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a word to translate");
        String firstWord = input.nextLine();
        
        //replace first a in the word to uba
        if (firstWord.contains("a" + "e" + "i" + "o" + "u")) {
           String translatedWordA = firstWord.replaceFirst("a", "uba");
            System.out.println(translatedWordA);
            

        } else if (firstWord.contains("a")) {
            String translatedWordA = firstWord.replaceFirst("a", "uba");
            System.out.println(translatedWordA);
            
            //replace first e in the word to ube
        } else if (firstWord.contains("e")) {
            String translatedWordE = firstWord.replaceFirst("e", "ube");
            System.out.println(translatedWordE);
            
            //replace first i in the word to ubi
        } else if (firstWord.contains("i")) {
            String translatedWordI = firstWord.replaceFirst("i", "ubi");
            System.out.println(translatedWordI);
            
            //replace fist o to ubo           
        } else if (firstWord.contains("o")) {
            String translatedWordO = firstWord.replaceFirst("o", "ubo");
            System.out.println(translatedWordO);
            
            //replace first u to ubu
        } else if (firstWord.contains("u")) {
            String translatedWordU = firstWord.replaceFirst("u", "ubu");
            System.out.println(translatedWordU);  
            
        }
       
        
    }
    
}
