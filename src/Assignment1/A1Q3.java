/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for the robot
        City kitchener = new City();
        
        //create a robot
        RobotSE leeno = new RobotSE(kitchener, 3, 0, Direction.EAST);
        
        //create a thing
        new Thing(kitchener, 3, 1);
        
        //create walls
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Wall(kitchener, 1, 3, Direction.WEST);
        new Wall (kitchener, 1, 3, Direction.NORTH);
        new Wall(kitchener, 1, 3, Direction.EAST);
        new Wall(kitchener, 2, 4, Direction.NORTH);
        new Wall(kitchener,2, 4, Direction.EAST);
        new Wall(kitchener, 3, 4, Direction.EAST);
        
        //have the robot move and pick thing up
        leeno.move();
        leeno.pickThing();
        
        //robot change direction
        leeno.turnLeft();
    }
    
}
