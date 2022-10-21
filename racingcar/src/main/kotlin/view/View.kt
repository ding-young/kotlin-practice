package view

import model.Car
import java.text.ParseException

object View {
    fun readInputCarNames() : List<String> {
        println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
        return readln().split(',')
    }

    fun readInputRound() : Int {
        println("경기 라운드 수를 입력하세요")
        val round = try { readln().toInt()
        } catch (e: NumberFormatException) {
            throw IllegalArgumentException("숫자를 입력해주세요.")
        }
        require(round > 0) {"라운드 수는 양수만 가능합니다."}
        return round
    }

    private fun printCarStatus(car: Car) {
        println("${car.name} : ${car.distance}")
    }

    fun printRoundResult(cars: List<Car>) {
        cars.forEach { printCarStatus(it) }
        println()
    }

    fun printWinners(names: List<String>) {
        println("Winners: ${names.joinToString(",")}")
    }
}