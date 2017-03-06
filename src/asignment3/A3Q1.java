/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //creates a city named kw
        City kw = new City();

        Robot steve = new Robot(kw, 0, 0, Direction.EAST);
        new Thing(kw ,0 ,4);
        new Wall(kw,0 ,5 ,Direction.EAST);
        for(;;){
            //steve moves 
            steve.move();
            //if bot front is clear the loop stops
        if(!steve.frontIsClear()||steve.canPickThing()){
     break;
}
 
        }      
}

}