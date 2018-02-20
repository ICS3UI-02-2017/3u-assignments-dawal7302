/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author leendawamneh
 */
public class Assignement2ProgramQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a city for the robot
        City kitchener = new City();
        
        //create a robot 
        RobotSE leeno = new RobotSE(kitchener, 1, 1, Direction.EAST);
        
        //place a few things for the robot to pick up
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 3);
        new Thing(kitchener, 1, 4);
        new Thing(kitchener, 1, 5);
        new Thing(kitchener, 1, 6);
        new Thing(kitchener, 1, 7);
        new Thing(kitchener, 1, 8);
        new Thing(kitchener, 1, 9);
        new Thing(kitchener, 1, 10);
        new Thing(kitchener, 1, 11);
            
            //if the front is clear move
            while(leeno.getAvenue() ==12) {
                leeno.move();
                
                //is there something to pick up 
                if(leeno.canPickThing()) {
                    leeno.pickThing();
                    //count 7 things in backpack
            if(leeno.countThingsInBackpack() ==7) {
               
            } leeno.move();
                }
                }
            
               
        } 
     
        }
            
           
        
    
    

