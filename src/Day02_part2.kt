fun main() {

    val inputStream = readInputStream("day2_input")

    var gamesCanPlay = 0

    inputStream.bufferedReader().forEachLine { inputLine ->
        val blueCount = findHighestColorNumber(inputLine, "blue")
        val redCount = findHighestColorNumber(inputLine, "red")
        val greenCount = findHighestColorNumber(inputLine, "green")

        gamesCanPlay += (blueCount * redCount * greenCount)
    }

    gamesCanPlay.println()
}

private fun findHighestColorNumber(inputLine: String, colorCount: String) : Int {

    var startingIndex = 0
    var count = 0

    for (i in inputLine.indices) {

        val indexOfNumberWord = inputLine.indexOf(colorCount, startingIndex)

        if (indexOfNumberWord != -1) {
            startingIndex = indexOfNumberWord + 1
            var startOfWordIndex = indexOfNumberWord - 3

            val blueNumberString =
                "${inputLine[startOfWordIndex]}${inputLine[startOfWordIndex + 1]}${inputLine[startOfWordIndex + 2]}"
            val blueShortened = blueNumberString.trim().toInt()

            if (blueShortened > count) {
                count = blueShortened
            }
        }
    }
    return count
}
