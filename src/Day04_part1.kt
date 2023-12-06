fun main() {

    val puzzleLines = readInput("day4_input")
    var total = 0

    puzzleLines.forEach { line ->

        var linePoints = 0

        val lineWithoutCardNumber = line.substringAfter(":")
        val winningLine = lineWithoutCardNumber.substringBefore("|")
        val cardLine = lineWithoutCardNumber.substringAfter("|")

        val winningList = winningLine.trim().split(" ").toMutableList()
        winningList.removeAll(listOf(""))
        val cardList = cardLine.trim().split(" ").toMutableList()
        cardList.removeAll(listOf(""))

        winningList.forEach { winningNumber ->

            if (cardList.contains(winningNumber)) {
                if (linePoints == 0) {
                    linePoints = 1
                }
                else {
                    linePoints *= 2
                }
            }
        }
        total += linePoints
    }

    total.println()
}

