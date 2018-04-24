/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author leendawamneh
 */
public class MethodsExample {

    // The helloWorld method to say hello
    public static void helloWorld() {
        System.out.println("Hello World!");
    }
    
    // say hello to a user
    public static void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    
    //calculates the positive root of quadratic formula
    public static double positiveQuadFormula(double a, double b, double c) {
        double discriminant = b*b - 4*a*c;
        double root = (-b + Math.sqrt(discriminant))/(2*a);
        // send back the root
        return root;
                
    }
    public static double [] quadFormula(double a, double b, double c) {
        //create an array to store both roots
        double[] roots = new double[2];
        //calculate the roots
        double discriminant = b*b - 4*a*c;
        roots [0] = (-b + Math.sqrt(discriminant))/(2*a);
        roots [1] = (-b + Math.sqrt(discriminant))/(2*a);
        // send back the root
        return roots;
        
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        // call the helloWorld method
        helloWorld();
        
        System.out.println("What is your name?");
        String user = in.nextLine();
        sayHello(user);
        
        //calculate the positive root of 3x^2+7x+1.5
        double positiveRoot = positiveQuadFormula(1,-5,-50);
        System.out.println("The positive root is " + positiveRoot);
        
        double[] roots = quadFormula(1,-5,-50);
        System.out.println("The roots are " + roots[0] + " and " + roots[1]);
    }
   
    
}
