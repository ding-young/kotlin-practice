package model

private const val threshold = 4
private val range = (1..10)

class MoveStrategy {
    fun canMove() : Boolean = randNum() >= threshold

    private fun randNum() : Int {
        return range.random()
    }
}