fun main() {
    var fizz = "Fizz"
    var Buzz = "Buzz"
    var number = 1
    while (number < 100){
        println(when{
            number%15 == 0 -> "fizzBuzz"
            number%5 == 0 -> "Buzz"
            number%3 == 0 -> "fizz"
            else -> "$number"
        })
        number++
    }

}