package level1

import kotlin.math.abs

/**
 * 탁구 경기
 */

var gameSet = 0
var x = 0
var y = 0
var isGameEnd = false
var games = mutableListOf<String>()

private fun solution() {
    for (game in games) {
        if (isGameEnd) break

        when (game) {
            "T" -> x++
            "P" -> y++
        }

        if (abs(x - y) >= 2) isGameEnd = true
    }

    println("$x:$y")
}

private fun input() = with(System.`in`.bufferedReader()) {
    gameSet = readLine().toInt()
    repeat(gameSet) {
        games.add(readLine())
    }
}

fun main(args: Array<String>) {
    input()
    solution()
}