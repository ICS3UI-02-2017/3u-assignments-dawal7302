/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assigment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class Assignment3Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city
        City kitchener = new City();
        
        // create a robot
        RobotSE leeno = new RobotSE(kitchener, 3, 3, Direction.SOUTH);
        
        //create walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.EAST);
        new Wall(kitchener, 1, 4, Direction.NORTH);
        new Wall(kitchener, 1, 5, Direction.NORTH);
        new Wall(kitchener, 1, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.WEST);
        new Wall(kitchener, 2, 4, Direction.SOUTH);
        new Wall(kitchener, 2, 5, Direction.SOUTH);
        new Wall(kitchener, 1, 5, Direction.EAST);
        new Wall(kitchener, 2, 5, Direction.EAST);
        new Wall(kitchener, 4, 1, Direction.NORTH);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        new Wall(kitchener, 4, 1, Direction.WEST);
        new Wall(kitchener, 5, 1, Direction.WEST);
        new Wall(kitchener, 5, 1, Direction.SOUTH);
        new Wall(kitchener, 5, 2, Direction.SOUTH);
        new Wall(kitchener, 4, 2, Direction.EAST);
        new Wall(kitchener, 5, 2, Direction.EAST);
        new Wall(kitchener, 4, 4, Direction.NORTH);
        new Wall(kitchener, 4, 5, Direction.NORTH);
        new Wall(kitchener, 4, 4, Direction.WEST);
        new Wall(kitchener, 5, 4, Direction.WEST);
        new Wall(kitchener, 5, 4, Direction.SOUTH);
        new Wall(kitchener, 5, 5, Direction.SOUTH);
        new Wall(kitchener, 4, 5, Direction.EAST);
        new Wall(kitchener, 5, 5, Direction.EAST);
        
        
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(6);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(6);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(6);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        leeno.turnLeft();
        leeno.move(3);
        
        
            
                
        
        
    }
    
}
