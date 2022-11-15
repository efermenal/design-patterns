package src.main.kotlin.creationalPatterns

import src.main.kotlin.creationalPatterns.Direction.*

class MazeGameDefault {

    /**
     * This function is pretty complicated, considering that all it does is create a maze with two rooms.
     */
    fun createMaze(): Maze {
        val aMaze = Maze()
        val r1 = Room(1)
        val r2 = Room(2)
        val theDoor = Door(r1, r2)

        aMaze.addRoom(r1)
        aMaze.addRoom(r2)

        r1.setSide(NORTH, Wall())
        r1.setSide(EAST, theDoor)
        r1.setSide(SOUTH, Wall())
        r1.setSide(WEST, Wall())

        r2.setSide(NORTH, Wall())
        r2.setSide(EAST, Wall())
        r2.setSide(SOUTH, Wall())
        r2.setSide(WEST, theDoor)

        return aMaze
    }
}
