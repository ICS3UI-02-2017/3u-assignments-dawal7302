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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for the robot 
        City kitchener = new City();
        
        //create a robot in the city
        RobotSE leeno = new RobotSE(kitchener, 0, 0, Direction.SOUTH);
        RobotSE karel = new RobotSE(kitchener, 0, 1, Direction.SOUTH);
        
        //create a wall
        new Wall(kitchener, 0, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 1, 1, Direction.SOUTH);
        
        //have leeno move n number of spaces and change direction
        leeno.move(2);
        leeno.turnLeft();
        leeno.move(1);
        
        //have karel change direction and move n number of spaces
        karel.turnLeft();
        karel.move(1);
        karel.turnRight();
        karel.move(2);
        karel.turnRight();
        karel.move(1);
    }
    
}
