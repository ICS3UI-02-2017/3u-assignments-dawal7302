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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robots
        City kitchener = new City();
        
        //create robots
        RobotSE leeno = new RobotSE(kitchener, 0, 1, Direction.WEST);
        RobotSE karel = new RobotSE(kitchener, 3, 3, Direction.EAST);
        
        //create walls
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        
        //label leeno m and karel k
        leeno.setLabel("M");
        karel.setLabel("K");
        
        //create things
        new Thing(kitchener, 0, 0);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 2, 2);
        
        //robot leeno move and pick up 3 things
        leeno.move();
        leeno.pickThing();
        leeno.turnLeft();
        leeno.move();
        leeno.pickThing();
        leeno.turnLeft();
        leeno.move();
        leeno.pickThing();
        
        //robot karel move and pick up 2 things
        karel.turnRight();
        karel.turnRight();
        karel.move();
        karel.turnRight();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
    }
    
}
