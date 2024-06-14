package level1

/**
 * 절약
 */

private var n = 0
private var money: Long = 0
private var deal = listOf<String>()

private fun input() = with(System.`in`.bufferedReader()) {
    n = Integer.parseInt(readLine())

    repeat(n) {
        deal = readLine().split(" ")
        money = when (deal[0]) {
            "in" -> money + Integer.parseInt(deal[1]).toLong()
            "out" -> money - Integer.parseInt(deal[1]).toLong()
            else -> money
        }
        if (money < 0) {
            println("fail")
            return
        }
    }

    println(if (money >= 0) "success" else "fail")
}

fun main() {
    input()
}