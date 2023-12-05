fun main() {

    val inputStream = readInputStream("day2_input")

    var gamesCanPlay = 0

    inputStream.bufferedReader().forEachLine { inputLine ->
        val blueCount = findHighestColor(inputLine, "blue")
        val redCount = findHighestColor(inputLine, "red")
        val greenCount = findHighestColor(inputLine, "green")

        if (blueCount <= 14 && greenCount  <= 13 && redCount <= 12) {

            val gameCanPlay: Int
            val digitIndex = inputLine.indexOfFirst{it.isDigit()}
            val digitIndexPlus1 = digitIndex+1
            val digitIndexPlus2 = digitIndexPlus1+1

            gameCanPlay = if (inputLine.get(digitIndexPlus2).isDigit())  {
                "${inputLine[digitIndex]}${inputLine[digitIndexPlus1]}${inputLine[digitIndexPlus2]}".toInt()
            } else if (inputLine[digitIndexPlus1].isDigit())  {
                "${inputLine[digitIndex]}${inputLine[digitIndexPlus1]}".toInt()
            } else {
                inputLine[digitIndex].toString().toInt()
            }

            gamesCanPlay += gameCanPlay
        }
    }

    gamesCanPlay.println()
}

private fun findHighestColor(inputLine: String, colorCount: String) : Int {

    var startingIndex = 0
    var count = 0

    for (i in inputLine.indices) {

        val indexOfNumberWord = inputLine.indexOf(colorCount, startingIndex)

        if (indexOfNumberWord != -1) {
            startingIndex = indexOfNumberWord + 1
            val startOfWordIndex = indexOfNumberWord - 3

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
