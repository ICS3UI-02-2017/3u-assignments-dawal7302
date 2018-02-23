/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class Assignment2Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot 
        RobotSE leeno = new RobotSE(kitchener, 1, 2, Direction.EAST);
        
        //create walls
        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.SOUTH);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.EAST);
        new Wall(kitchener, 4, 4, Direction.SOUTH);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.SOUTH);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.EAST);
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        //see if front is clear and move to guard the castle
       while(leeno.countThingsInBackpack() ==0) {
        if(leeno.frontIsClear()) {
            leeno.move();
            leeno.turnLeft();
            leeno.move();
            leeno.turnRight();
            leeno.move(2);
            leeno.turnRight();
            leeno.move(2);
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
            leeno.move(2);
            leeno.turnRight();
            leeno.move(2);
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
            leeno.move(2);
            leeno.turnRight();
            leeno.move(2);
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
            leeno.move(2);
            leeno.turnRight();
            leeno.move(2);
            leeno.turnRight();
            leeno.move();
            leeno.turnLeft();
        }
        
    }
    
} }
