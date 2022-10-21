package view

import model.Car

object View {
    fun readInputCarNames() : List<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        return readln().split(',')
    }

    fun readInputRound() : Int {
        println("경기 라운드 수를 입력하세요")
        return readln().toInt()
    }

    fun printCarStatus(car: Car): String {
        return "$car.name : $car.distance"
    }

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { printCarStatus(it) }
        println()

    }
}