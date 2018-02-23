/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot for the city 
        RobotSE leeno = new RobotSE(kitchener, 4, 0, Direction.EAST);
        
        //create walls for the robot to climb
        new Wall(kitchener, 4, 2, Direction.WEST);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        new Wall(kitchener, 3, 3, Direction.WEST);
        new Wall(kitchener, 3, 3, Direction.NORTH);
        new Wall(kitchener, 2, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.NORTH);
        new Wall(kitchener, 2, 5, Direction.EAST);
        new Wall(kitchener, 3, 6, Direction.NORTH);
        new Wall(kitchener, 3, 6, Direction.EAST);
        new Wall(kitchener, 4, 7, Direction.NORTH);
        new Wall(kitchener, 4, 7, Direction.EAST);
        
        //create things for the robot to pick up and drop off
        new Thing(kitchener, 4, 1);
        new Thing(kitchener, 3, 2);
        new Thing(kitchener, 2, 3);
        new Thing(kitchener, 1, 4);
        
        //have the robot climb the mountain and pick up things
        leeno.move();
        leeno.pickThing();
        leeno.turnLeft();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.pickThing();
        leeno.turnLeft();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.pickThing();
        leeno.turnLeft();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.pickThing();
        
        //have robot go down the mountain and drop things off
        leeno.move();
        leeno.putThing();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.putThing();
        leeno.turnLeft();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.putThing();
        leeno.turnLeft();
        leeno.move();
        leeno.turnRight();
        leeno.move();
        leeno.putThing();
        leeno.turnLeft();
        leeno.move();
    }
    
}
