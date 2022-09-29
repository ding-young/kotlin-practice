data class Game (val round: Int, val cars: List<Car>) {
    fun runAllRounds() {
        repeat(round) {
            moveCarsOnce()
        }
    }

    fun printRoundResults() {
        repeat(round) {
            cars.forEach { println(it) }
            println()
        }
    }

    private fun moveCarsOnce() = cars.forEach { it.moveForward(randNum(1, 10)) }

    private fun randNum(start: Int, end: Int) : Int {
        return (start..end).random()
    }
}
