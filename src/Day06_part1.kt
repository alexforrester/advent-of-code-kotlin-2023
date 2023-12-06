fun main() {

    var total = 1
    val gameLines = readInput("day6_input")
    val gameMap = mutableMapOf<Int, Int>()
    val timeListKeys = mutableListOf<Int>()
    val distanceListKeys = mutableListOf<Int>()

    gameLines.forEachIndexed { index, item ->

        if (index == 0) {
            val timeList = item.substringAfter(":").trim().split(Regex("\\s+"))
            timeList.forEach { timeValue ->
                timeListKeys.add(timeValue.toInt())
            }
        } else {
            val recordList = item.substringAfter(":").trim().split(Regex("\\s+"))
            recordList.forEach { recordValue ->
                distanceListKeys.add(recordValue.toInt())
            }
        }
    }

    for (i in 0 until timeListKeys.size) {
        gameMap[timeListKeys[i]] = distanceListKeys[i]
    }

    for (gameEntry in gameMap) {
        total *= calculateWinningToys(gameEntry)
    }

    total.println()
}

fun calculateWinningToys(gameEntry: Map.Entry<Int, Int>) : Int{

    val totalMilliseconds = gameEntry.key
    val distanceList = mutableListOf<Int>()

    for (millisecondsHeld in 1 until totalMilliseconds) {
        val secondsLeft = (totalMilliseconds - millisecondsHeld)
        distanceList.add(secondsLeft * millisecondsHeld)
    }

    val currentRecord = gameEntry.value

    return distanceList.filter { i -> i > currentRecord}.size
}
