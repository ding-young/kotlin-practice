import kotlin.random.Random

data class Car(val name: String, var distance: Int = 0) {
    companion object {
        fun validCarName(suspiciousName: String): Boolean {
            return suspiciousName.length <= 5
        }
    }

    fun moveForward(distance: Int) {
        this.distance += distance
    }

    override fun toString(): String {
        return "{$name} : {$distance}"
    }
}