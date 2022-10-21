package model

import view.View

data class Game (val round: Int, val cars: List<Car>, val moveStrategy: MoveStrategy = MoveStrategy()) {
    fun runAllRounds() {
        repeat(round) {
            moveCarsOnce()
            View.printRoundResult(cars)
        }
    }

    private fun moveCarsOnce() = cars.filter { moveStrategy.canMove() }.forEach { it.moveForward() }

    fun getWinnersNames() : List<String> {
        val maxDistance = maxDistacne()
        return cars.filter { it.distance == maxDistance }. map { it.name }
    }

    private fun maxDistacne() : Int {
        return cars.maxOfOrNull { it.distance } ?: throw NoSuchElementException()
    }
}
