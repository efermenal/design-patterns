package src.main.kotlin.creationalPatterns

class Door(private val room1: Room, private val room2: Room) : MapSite {

    private var isOpen = true

    override fun enter() {
        TODO("Not yet implemented")
    }

    fun otherSideFrom(room: Room): Room? {
        if (room == room1) {
            return room1
        }
        if (room == room2) {
            return room2
        }
        return null
    }
}
