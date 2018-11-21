package akrupych.waha

fun <T> listOf(n: Int, item: T) = List(n) { item }

data class DicedNumber(
    val dice: Int = 0,
    val number: Int = 0
) {
    fun roll(): Int {
        val roll = if (dice > 0) (1..dice).random() else 0
        return number + roll
    }

    override fun toString(): String {
        var result = ""
        if (dice > 0) result += "D$dice"
        if (number > 0) result += number
        return result
    }
}