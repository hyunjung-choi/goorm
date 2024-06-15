package level1

import java.util.*

/**
 * 뱀이 지나간 자리
 */

private var n = 0
private var m = 0

private fun solution() {
    val snakePassed = Array(n) { Array(m) { "." } }
    var snakeMoving = true

    for (i in 0..<n) {
        if (i == 0 || i % 2 == 0) {
            snakePassed[i] = Array(m) { "#" }
        } else {
            if (snakeMoving) {
                snakePassed[i][m - 1] = "#"
                snakeMoving = false
            } else {
                snakePassed[i][0] = "#"
                snakeMoving = true
            }
        }
        snakePassed[i].forEach { print(it) }
        println()
    }
}

private fun input() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    n = Integer.parseInt(st.nextToken())
    m = Integer.parseInt(st.nextToken())
}

fun main() {
    input()
    solution()
}