package src.main.kotlin.creationalPatterns

/**
 * Wall
 */
class Wall : MapSite {
    override fun enter() {
        println("There is a wall. You hit your nose.")
    }
}
