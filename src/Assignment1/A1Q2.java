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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city for the robot
        City kitchener = new City();

//create a robot
      RobotSE leeno = new RobotSE(kitchener, 1, 2, Direction.SOUTH);

// create a wall
        new Wall (kitchener, 1, 2, Direction.SOUTH);
        
        //create another wall
        new Wall (kitchener, 1, 2, Direction.EAST);
        
        new Wall (kitchener, 1, 1, Direction.NORTH);
        
        new Wall (kitchener, 1, 2, Direction.NORTH);
        
        new Wall (kitchener, 2, 1, Direction.WEST);
        
        new Wall (kitchener, 2, 1, Direction.SOUTH);
        
        new Wall (kitchener, 1, 1, Direction.WEST);
        
        //create a thing
        new Thing(kitchener, 2, 2);
        
        //robot change direction
        leeno.turnRight();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnLeft();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction 
        leeno.turnLeft();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //pick up thing
        leeno.pickThing();
        
        //robot change direction
        leeno.turnRight();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnLeft();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnLeft();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnLeft();
        
        //robot move n number of spaces
        leeno.move(2);
        
        //robot change direction
        leeno.turnRight();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnRight();
        
        //robot move n number of spaces
        leeno.move(1);
        
        //robot change direction
        leeno.turnRight();
        
        
        
        //
    }
    
}
