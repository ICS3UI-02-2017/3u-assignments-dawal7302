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
public class A7Q2 {

    public static double examGrade(double a, double b, double c, double d, double f) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter exam grade");
        int examGrades = input.nextInt();
        if(80 <= examGrades && examGrades <= 100) {
            System.out.println("Your grade is an A");
    }
        if(70 <= examGrades && examGrades <= 79) {
            System.out.println("Your grade is a B");
        }
        if(60 <= examGrades && examGrades <= 69) {
            System.out.println("Your grade is a C");
        }
        if(50 <= examGrades && examGrades <=59) {
            System.out.println("Your grade is a D");
        }
        if(examGrades < 50) {
            System.out.println("Your grade is an F");
        }
        return examGrades;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
