package asignment3;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.NORTH;
import static becker.robots.Direction.SOUTH;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nate
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
        Robot steve = new Robot(kw, 3, 2, Direction.EAST);

        //createing the walls on 1,1 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 1, 2, NORTH);
        new Wall(kw, 2, 1, WEST);

        new Wall(kw, 2, 4, EAST);

        new Wall(kw, 3, 1, WEST);
        new Wall(kw, 3, 1, SOUTH);

        // new Wall(kw, 3, 2, SOUTH);
        new Wall(kw, 3, 3, SOUTH);

        new Wall(kw, 3, 4, EAST);
        new Wall(kw, 3, 4, SOUTH);

        new Wall(kw, 1, 3, NORTH);

        new Wall(kw, 1, 4, NORTH);
        new Wall(kw, 1, 4, EAST);

        for (;;) {
            while (!steve.frontIsClear()) {
                steve.turnLeft();
            }
            if (steve.frontIsClear()) {
                steve.move();

                if (steve.frontIsClear()) {
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.turnLeft();

                    if (steve.frontIsClear()) {
                        steve.move();
                        break;
                    }
                }
            } else if (!steve.frontIsClear()) {
                steve.turnLeft();

            }

        }

    }
}
