/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class Assignment2Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot
        RobotSE leeno = new RobotSE(kitchener, 2, 0, Direction.EAST);
        
        //create walls
        new Wall(kitchener, 2, 0, Direction.SOUTH);
        new Wall(kitchener, 2, 0, Direction.EAST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 1, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.SOUTH);
        new Wall(kitchener, 2, 6, Direction.EAST);
        new Wall(kitchener, 2, 7, Direction.SOUTH);
        new Wall(kitchener, 2, 8, Direction.SOUTH);
        
        //create a thing
        new Thing(kitchener, 2, 8);
        
        //have robot change direction and move
        leeno.turnLeft();
        
        if(leeno.frontIsClear()) {
            leeno.move();
            leeno.turnRight();
        }
        if(leeno.frontIsClear()){
            leeno.move();
            leeno.turnRight();
            leeno.move();
        }
        if(!leeno.frontIsClear()) {
            leeno.turnLeft(2);
            leeno.move();
            leeno.turnRight();
            leeno.move();
            leeno.turnRight();
            leeno.move();
        } 
        if(!leeno.frontIsClear()) {
            leeno.turnLeft();
            leeno.move();
            
        }
        if(!leeno.frontIsClear()) {
            leeno.turnLeft();
            leeno.move();
            leeno.turnRight();
            leeno.move();
            leeno.turnRight();
            leeno.move();
        }
        if(!leeno.frontIsClear()) {
            leeno.turnLeft();          
        }
        if(leeno.frontIsClear()) {
            leeno.move(2);        
        }
        if(!leeno.frontIsClear()) {
            leeno.turnLeft();
            leeno.move();
            leeno.turnRight();
            leeno.move();
            leeno.turnRight();
            leeno.move();
        }
        if(!leeno.frontIsClear()) {
            leeno.turnLeft();
            leeno.move();
        }
    }
    
}
