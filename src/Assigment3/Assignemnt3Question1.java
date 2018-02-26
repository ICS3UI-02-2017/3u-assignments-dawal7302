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
public class Assignemnt3Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kitchener = new City();
        
        //create a robot 
        RobotSE leeno = new RobotSE(kitchener, 0, 2, Direction.WEST);
        
        //create walls
        new Wall(kitchener, 1, 1, Direction.NORTH);
        new Wall(kitchener, 1, 2, Direction.NORTH);
        new Wall(kitchener, 1, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.WEST);
        new Wall(kitchener, 2, 1, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 1, 2, Direction.EAST);
        new Wall(kitchener, 2, 2, Direction.EAST);
        
        
        
        //use loops to move around it 
        int numberOfMoves = 2;
        if (numberOfMoves <3) {
            leeno.move(2);
            leeno.turnLeft();
            leeno.move(3);
            leeno.turnLeft();
            leeno.move();           
        }
       
        }
       
       }
    
    

