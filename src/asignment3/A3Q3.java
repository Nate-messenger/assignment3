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
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author nate
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
        Robot steve = new Robot(kw, 1, 1, Direction.EAST);

        //createing the walls on 1,1 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 2, 1, WEST);

        new Wall(kw, 2, 4, EAST);
        new Wall(kw, 4, 4, EAST);

        new Wall(kw, 4, 4, SOUTH);
        new Wall(kw, 3, 1, WEST);

        new Wall(kw, 4, 2, SOUTH);
        new Wall(kw, 4, 3, SOUTH);

        new Wall(kw, 3, 4, EAST);

        new Wall(kw, 1, 3, NORTH);
        new Wall(kw, 1, 2, NORTH);
        new Wall(kw, 1, 4, NORTH);
        new Wall(kw, 1, 4, EAST);

        new Thing(kw, 2, 1, Direction.NORTH);

        new Thing(kw, 3, 1, SOUTH);

        new Thing(kw, 4, 3, EAST);

        new Thing(kw, 3, 2, NORTH);

        new Thing(kw, 2, 3, SOUTH);
        int i = 0;
        for (;;) {
            //move wnen front is clear and check if there is anything to pick up
            while (steve.frontIsClear()) {
                steve.move();
                if (steve.canPickThing()) {
                    steve.pickThing();
                }
            }
            //when it hits a wall while faceing east turn left 3 times
            if (!steve.frontIsClear() && steve.getDirection() == EAST) {
                steve.turnLeft();
                steve.turnLeft();
                steve.turnLeft();
                if (steve.frontIsClear()) {
                    steve.move();
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.turnLeft();
                    steve.move();
                }

                while (steve.canPickThing()) {
                    steve.pickThing();
                }

            }
            //clears the line of the box
            while (steve.frontIsClear()) {
                steve.move();
                if (steve.canPickThing()) {
                    steve.pickThing();
                }
            }
            //when it reaches the end of the row while it is faceing west it turn into the next row
            if (!steve.frontIsClear() && steve.getDirection() == WEST) {
                steve.turnLeft();

                while (steve.canPickThing()) {
                    steve.pickThing();
                }

                steve.turnLeft();
            }
//when it reaches the end it goes to the start
            if (steve.getDirection() == SOUTH && !steve.frontIsClear()) {
                i++;
            }
            if (i == 1) {
                //cheks if steve is at one
                while (steve.getAvenue() > 1) {

                    if (steve.getDirection() == Direction.NORTH) {
                        steve.turnLeft();
                        steve.turnLeft();
                        steve.turnLeft();
                        steve.turnLeft();
                    }
                    if (steve.getDirection() == Direction.SOUTH) {
                        steve.turnLeft();
                    }
                    if (steve.getDirection() == Direction.EAST) {
                        steve.turnLeft();
                        steve.turnLeft();
                    }
                    if (steve.getDirection() == Direction.WEST) {
                        steve.move();
                    }
                }
                //cheks if steve is at street one
                while (steve.getStreet() > 1) {

                    if (steve.getDirection() == Direction.WEST) {
                        steve.turnLeft();

                    }
                    if (steve.getDirection() == Direction.SOUTH) {
                        steve.turnLeft();
                        steve.turnLeft();
                    }
                    if (steve.getDirection() == Direction.EAST) {
                        steve.turnLeft();
                        steve.turnLeft();
                        steve.turnLeft();
                    }
                    if (steve.getDirection() == Direction.NORTH) {
                        steve.move();
                    }

                }
                break;

            }
        }
    }
}
