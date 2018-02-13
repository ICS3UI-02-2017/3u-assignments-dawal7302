/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author dawal7302
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for the robot
        City kitchener = new City();
        
        //Create a robot 
        RobotSE leeno = new RobotSE(kitchener, 0, 2, Direction.WEST);
        
        //Create a wall
        new Wall (kitchener, 1, 2, Direction.NORTH);
        
        new Wall (kitchener, 1, 1, Direction.NORTH);
        
        new Wall (kitchener, 1, 2, Direction.EAST);
        
        new Wall (kitchener, 2, 2, Direction.EAST);
        
        new Wall (kitchener, 2, 1, Direction.SOUTH);
        
        new Wall (kitchener, 2, 2, Direction.SOUTH);
        
        new Wall (kitchener, 1, 1, Direction.WEST);
        
        new Wall (kitchener, 2, 1, Direction.WEST);
        
        //move the robot n number of spaces
        leeno.move(2);
        
        //robot change direction
        leeno.turnLeft();
        
        //move the robot down n muber of spaces
        leeno.move(3);
        
        //robot change direction
        leeno.turnLeft();
        
        //move the robot right number of spaces
        leeno.move(3);
        
        //robot change direction
        leeno.turnLeft();
        
        //move the robot up number of spaces
        leeno.move(3);
        
        //robot change direction
        leeno.turnLeft();
        
        //move the robot left n number of spaces
        leeno.move(1);
        
    }
}
