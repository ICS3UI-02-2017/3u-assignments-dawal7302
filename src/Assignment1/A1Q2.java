/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
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
        new Wall (kitchener, 2, 2, Direction.NORTH);
        
        //create another wall
        new Wall (kitchener, 1, 2, Direction.EAST);
        
        new Wall (kitchener, 1, 1, Direction.NORTH);
    }
    
}
