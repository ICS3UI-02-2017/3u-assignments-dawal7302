/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author leendawamneh
 */
public class Assignment3Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kitchener = new City();
        
        //create a robot carrying 20 things
        RobotSE leeno = new RobotSE(kitchener, 1, 1, Direction.EAST,20);
        
        //have the robot move and put things
        leeno.putThing();
        int numberOfMoves =-1;
        while(numberOfMoves <0) {
            numberOfMoves = numberOfMoves +1;
            leeno.move();
            leeno.putThing();
            leeno.move();
            leeno.putThing();
            leeno.move();
            leeno.putThing();
            leeno.move();
            leeno.putThing();
            leeno.turnRight();
            leeno.move();
            leeno.putThing();
            leeno.turnRight();
        }
        
    }
    
}
