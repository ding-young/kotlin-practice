import model.Car
import model.Game
import view.View

fun main(args: Array<String>) {
    val cars = initCars()
    val round = initRound()
    val game = Game(round, cars)

    game.runAllRounds()
    View.printWinners(game.getWinnersNames())
}

fun initCars() : List<Car> {
    return try {
        val carNames = View.readInputCarNames()
        val cars: MutableList<Car> = mutableListOf()
        carNames.forEach { cars.add(Car(it)) }
        cars
    } catch (e : IllegalArgumentException) {
        println(e.message)
        initCars()
    }
}

fun initRound() : Int {
    return try {
        View.readInputRound()
    } catch (e : IllegalArgumentException) {
        println(e.message)
        initRound()
    }
}