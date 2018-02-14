/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author leendawamneh
 */
public class ConditionsExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create a city
        City kitchener = new City();
        
        //create a robot
        RobotSE karel = new RobotSE (kitchener, 2, 1, Direction.EAST);
        
        //create a wall infront
        new Wall(kitchener, 2, 5, Direction.EAST);
        
        //place few things
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 2, 4);
        
        //move robot while the front is not clear
        while(karel.frontIsClear()) {
            //if the front is clear
            karel.move();
            
            //is there something to pick up?
            if(karel.canPickThing()) {
            karel.pickThing();
            }
        }
        //when the front is not clear
        karel.turnRight();
        
        //Do you have on ething in your backpack
        if(karel.countThingsInBackpack() == 1) {
            karel.move();
        }else if(karel.countThingsInBackpack() == 2) {
            karel.move(2);
        }else
            karel.turnAround();
        
        
        
        
        
        
        
    }
    
}
