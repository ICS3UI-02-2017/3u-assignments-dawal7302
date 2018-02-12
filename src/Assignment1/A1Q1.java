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
        new Wall (kitchener, 2, 3, Direction.NORTH);
    }
}
