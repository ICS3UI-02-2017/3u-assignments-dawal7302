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
public class A7Q1 {

    //calculate the area of the circle
    public static double radius(double a) {
        double radius = a;
        double area = 3.14*Math.pow(radius,2);
        //send back the area
        return area;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner to send the area of the circle
        double areaOfCircle = radius(3);
        System.out.println("The area of the circle is " + areaOfCircle);
    }
    
}
