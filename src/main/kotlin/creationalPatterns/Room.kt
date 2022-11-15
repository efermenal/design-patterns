package src.main.kotlin.creationalPatterns

class Room(val roomNo: Int) : MapSite {

    private val sides = mutableMapOf<Direction, MapSite>()

    override fun enter() {
        TODO("Not yet implemented")
    }

    fun setSide(direction: Direction, destination: MapSite) {
        sides[direction] = destination
    }

    fun getSide(direction: Direction): MapSite? = sides[direction]
}
