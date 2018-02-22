/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author leendawamneh
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);
        
        //counted while loop
        int numberOfMoves =5;
        while(numberOfMoves >0) {
            karel.move();
            numberOfMoves = numberOfMoves - 1;
        }
        karel.turnAround();
        
        //counting the other way
        numberOfMoves = 0;
        while (numberOfMoves <5) {
            karel.move();
            numberOfMoves = numberOfMoves + 1;
        }
        
        karel.turnAround();
        //use of for loop to move
        for(int count = 0; count < 5; count++){
            karel.move();               
        }
        
        
        int x = 10;
        x = x + 5; //adds 5
        x += 5; //adds 5
        
        x -= 10; //subtract 10 shortcut
        x = x - 10;
        
        x *= 2; //multiply by 2
        x = x * 2;
        
        x /= 4;
        x = x / 4;
        
       
        
        
        
    }
    
    
}
