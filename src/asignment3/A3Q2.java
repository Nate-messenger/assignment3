/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment3;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.SOUTH;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
             RobotSE bob = new RobotSE(kw, 0, 2, Direction.WEST);
             
             //createing the walls on 1,1 
             new Wall(kw, 1, 1, Direction.NORTH);
              new Wall(kw, 1, 1, Direction.WEST);
            //createing the walls in 2,1
            new Wall(kw, 2, 1, WEST);
            new Wall(kw, 2, 1, SOUTH);
            //creatreing the walls in 2,2
            new Wall(kw, 2 ,2, SOUTH);
            new Wall(kw, 2 ,2, EAST);
            //creating the walls on 1,3
            new Wall(kw, 1, 2, EAST);
            new Wall(kw, 1, 2, NORTH);
            
            for (int i = 0; i < 8; i++){
            //makes bob walk to the corner
            bob.move(2);
            //turns bob around the corner
            bob.turnLeft();
            //makes bob walk to the corner
            bob.move();
    }
    }
    }
    

