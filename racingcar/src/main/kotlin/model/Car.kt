package model

private const val maxCarNameLength = 5
private const val moveDistance = 1

data class Car(val name: String, var distance: Int = 0) {
    init {
        require(name.isNotBlank()) {"자동차 이름은 공백이 될 수 없습니다."}
        require(name.length <= maxCarNameLength) {"자동차 이름의 길이는 최대 $maxCarNameLength 입니다."}
    }

    fun moveForward() { this.distance += moveDistance }
}