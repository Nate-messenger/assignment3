/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asignment3;

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.SOUTH;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author nate
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a city named kw
        City kw = new City();
        //creates aa new robot named bob
        RobotSE steve = new RobotSE(kw, 0, 1, SOUTH);

        kw.showThingCounts(true);

        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        int i = 0;

        for (;;) {
            //picks up the items to put down
            if (steve.canPickThing()) {
                steve.pickAllThings();
            }
            //bot turns left into the things
            if (i == 0) {
                steve.turnLeft();
                i++;
            }
            //when the bot has the things it createss the line of the bar graph
            while (steve.countThingsInBackpack() > 0) {
                steve.putThing();
                steve.move();
            }
            //when all the things are placed it turns around and goes back
            if (steve.countThingsInBackpack() == 0) {
                steve.turnAround();
                steve.move();
            }
            //goes back to the front of the line
            while (steve.canPickThing()) {
                steve.move();
            }
            //when there is no longer something to pick up go to the next row
            if (!steve.canPickThing()) {
                steve.turnLeft();
                steve.move();
                steve.turnLeft();
                steve.move();
                if (!steve.canPickThing()) {
                    steve.turnRight();
                    break;
                }
            }

        }
    }

}
