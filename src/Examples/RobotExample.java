/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Learning how to use the robots
 * @author dawal7302
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Create a City for the Robot
    City kw = new City(); 
    
    // put a robot in kw
    RobotSE karel = new RobotSE(kw, 2,3,Direction.EAST);
    
    //create a wall
    new Wall (kw, 2, 5, Direction.WEST);
    
    //create a thing
    new Thing(kw, 2, 4);
    
    //move the robot forward 1 space
    karel.move();
    
    //move the robot n number of spaces
    //karel.move(2);
    
    //turn the robot to the left
    karel.turnLeft();
    
    //put the letter K on karel
    karel.setLabel("L");
    
    //set the colour of the robot 
    karel.setColor(Color.yellow);
    
    //pick up the thing
    karel.pickThing();
    
    //move again
    karel.move();
    
    //turn the robot to the right
    karel.turnRight(2);
    
    karel.countThingsInBackpack();
    
    
    
   
    }
}
