fun main(args: Array<String>) {
    // 1. read input car name and # of rounds
    println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)")
    val carNames = readln().split(',')
    println("경기 라운드 수를 입력하세요")
    val round = readln().toInt()
    val cars: MutableList<Car> = mutableListOf()

    // 2. fill out cars, Game
    carNames.forEach { if (Car.validCarName(it)) cars.add(Car(it)) } // TODO error
    val game = Game(round, cars)

    // 3. run
    game.runAllRounds()
    game.printRoundResults()
}
