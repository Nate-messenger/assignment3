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
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
        RobotSE steve = new RobotSE(kw, 3, 3, SOUTH);

        //createing the walls on 1,1 
        new Wall(kw, 1, 1, NORTH);
        new Wall(kw, 1, 1, WEST);
        //createing the walls in 2,1
        new Wall(kw, 2, 1, WEST);
        new Wall(kw, 2, 1, SOUTH);
        //creatreing the walls in 2,2
        new Wall(kw, 2, 2, SOUTH);
        new Wall(kw, 2, 2, EAST);
        //creating the walls on 1,3
        new Wall(kw, 1, 2, EAST);
        new Wall(kw, 1, 2, NORTH);

        //createing the walls on 1,4 
        new Wall(kw, 1, 4, NORTH);
        new Wall(kw, 1, 4, WEST);
        //createing the walls in 2,4
        new Wall(kw, 2, 4, WEST);
        new Wall(kw, 2, 4, SOUTH);
        //creatreing the walls in 2,5
        new Wall(kw, 2, 5, SOUTH);
        new Wall(kw, 2, 5, EAST);
        //creating the walls on 1,5
        new Wall(kw, 1, 5, EAST);
        new Wall(kw, 1, 5, NORTH);

        //createing the walls on 1,1 
        new Wall(kw, 4, 4, NORTH);
        new Wall(kw, 4, 4, WEST);
        //createing the walls in 2,1
        new Wall(kw, 5, 4, WEST);
        new Wall(kw, 5, 4, SOUTH);
        //creatreing the walls in 2,2
        new Wall(kw, 4, 5, NORTH);
        new Wall(kw, 4, 5, EAST);
        //creating the walls on 1,3
        new Wall(kw, 5, 5, EAST);
        new Wall(kw, 5, 5, SOUTH);

        //createing the walls on 4,1 
        new Wall(kw, 4, 1, NORTH);
        new Wall(kw, 4, 1, WEST);
        //createing the walls in 5,1
        new Wall(kw, 5, 1, WEST);
        new Wall(kw, 5, 1, SOUTH);
        //creatreing the walls in 5,2
        new Wall(kw, 5, 2, SOUTH);
        new Wall(kw, 5, 2, EAST);
        //creating the walls on 4,2
        new Wall(kw, 4, 2, EAST);
        new Wall(kw, 4, 2, NORTH);

        //makes the for loop run 4 times
        for (int i = 0; i < 4; i++){
            //running around the box for loop
            for (int x = 0; x < 3; x++){
                steve.move(3);
                steve.turnLeft();
            }
            //after the box has been run around moves to the other box
            steve.move(3);
        }
    }
}
