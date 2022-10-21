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
}
