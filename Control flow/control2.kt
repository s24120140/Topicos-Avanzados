import kotlin.random.Random

fun main() {
    val button = "A"
    val result = when (button) {
        "A" -> "yes"
        "B" -> "no"
        "X" -> "Menu"
        "Y" -> "Nothimg"
        else -> "There is no such button"
    }
    println(result)
}