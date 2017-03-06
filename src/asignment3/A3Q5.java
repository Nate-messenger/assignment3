package asignment3;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.EAST;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nate
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
        RobotSE steve = new RobotSE(kw, 3, 2, Direction.EAST);

        kw.showThingCounts(true);

        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);
        new Thing(kw, 3, 2);

        for (;;) {
            //when it can pick something it moves it over and then goes back
            while (steve.canPickThing()) {
                steve.pickThing();
                steve.move();
                steve.putThing();
                steve.turnLeft(2);
                steve.move();
                steve.turnLeft(2);
            }
            //when there is nothing to pick up and it is faceing west it turns back east
            while (!steve.canPickThing() && steve.getDirection() == WEST) {
                steve.turnLeft(2);
            }
            //moves it back on the things
            steve.move();
        }
    }

}
