fun main() {

    val total: Int
    val gameLines = readInput("day6_input")

    var time = 0L
    var distance = 0L

    gameLines.forEachIndexed { index, item ->

        if (index == 0) {
            time = item.substringAfter(":").replace(Regex("\\s+"), "").toLong()
        } else {
            distance = item.substringAfter(":").replace(Regex("\\s+"), "").toLong()
        }
    }

    total = calculateWinningToys(Pair(time, distance))

    total.println()
}

fun calculateWinningToys(gameEntry: Pair<Long, Long>): Int {

    val totalMilliseconds = gameEntry.first
    val distanceList = mutableListOf<Long>()

    for (millisecondsHeld in 1 until totalMilliseconds) {
        val secondsLeft = (totalMilliseconds - millisecondsHeld)
        distanceList.add(secondsLeft * millisecondsHeld)
    }

    val currentRecord = gameEntry.second

    return distanceList.filter { i -> i > currentRecord }.size
}
