/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author leendawamneh
 */
public class Assignment3Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot 
        RobotSE leeno = new RobotSE(kitchener, 1, 2, Direction.EAST);
        
        //create things for the robot to pick up
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 3);
        
        //have robot move and pick things and put them down
        int numberOfMoves =1;
        while(numberOfMoves >0) {
            leeno.move();
            numberOfMoves = numberOfMoves -1;
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
            leeno.turnAround();
            leeno.move();
            leeno.turnAround();
            leeno.pickThing();
            leeno.move();
            leeno.putThing();
        }
                
    }
    
}
