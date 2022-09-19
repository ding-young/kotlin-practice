data class Car(val name: String, var distance: Int = 0) {
    private val threshold = 4

    companion object {
        fun validCarName(suspiciousName: String): Boolean {
            return suspiciousName.length <= 5
        }
    }

    fun moveForward(inputNum: Int) = this.let { if (inputNum >= threshold) it.distance += 1 }

    override fun toString(): String {
        return "{$name} : {$distance}"
    }
}