package level1

/**
 * 합 계산기
 */

enum class Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

    fun apply(a: Int, b: Int): Int {
        return when (this) {
            ADD -> a + b
            SUBTRACT -> a - b
            MULTIPLY -> a * b
            DIVIDE -> a / b
        }
    }
}

var list = mutableListOf<String>()

private fun solution() {
    var answer = 0
    for (calculus in list) {
        answer += calculate(calculus)
    }
    println(answer)
}

private fun calculate(str: String): Int {
    val calculus = str.split(" ")
    val a = calculus.first().toInt()
    val b = calculus.last().toInt()
    val operator = when (calculus[1]) {
        "+" -> Operator.ADD
        "-" -> Operator.SUBTRACT
        "*" -> Operator.MULTIPLY
        else -> Operator.DIVIDE
    }

    return operator.apply(a, b)
}

private fun input() = with(System.`in`.bufferedReader()) {
    val t = Integer.parseInt(readLine())
    repeat(t) {
        list.add(readLine())
    }
}

fun main() {
    input()
    solution()
}