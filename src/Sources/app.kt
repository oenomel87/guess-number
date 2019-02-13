import java.lang.NumberFormatException

fun main(args: Array<String>) {
    val answer = (0..100).shuffled().first()
    println("Find Random Number 0 ~ 100")
    while (true) {
        val input = inputNumber()
        if (input < 0 || input > 100) {
            println("Please input number 0 to 100")
        } else if (answer > input) {
            println("bigger than $input")
        } else if (answer < input) {
            println("smaller than $input")
        } else {
            println("Correct!")
            break
        }
        println()
    }
}

fun inputNumber(): Int {
    val input: Int?
    try {
        print("Guess number: ")
        input = readLine()!!.toInt()
    }
    catch (e: NumberFormatException) {
        return -1
    }
    return input
}