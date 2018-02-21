/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author leendawamneh
 */
public class Assignment2Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot
        RobotSE leeno = new RobotSE(kitchener, 2, 2, Direction.NORTH);
        
        //have the robot move and return to orogin (0,0)
        while(leeno.getStreet() !=0) {
            leeno.move();
        }
        leeno.turnLeft();
        while(leeno.getAvenue() !=0) {
            leeno.move();
        }
        
        }
    }
    
