package src.main.kotlin.creationalPatterns

/**
 * A Maze is set of rooms. A room knows its neighbors; possible neighbors are another room, a [Wall], or a [Door] to another room
 */
class Maze {

    private val rooms = mutableListOf<Room>()

    fun addRoom(room: Room) {
        rooms.add(room)
    }

    fun getRoom(roomNumber: Int): Room? {
        return rooms.find { it.roomNo == roomNumber }
    }
}
