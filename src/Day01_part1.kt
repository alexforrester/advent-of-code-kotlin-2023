fun main() {

    var total = 0

    val inputStream = readInputStream("day1_input")

    inputStream.bufferedReader().forEachLine { inputLine ->

        val firstDigitPos = inputLine.indexOfFirst { it.isDigit() }
        val lineArray: Array<String> = inputLine.toCharArray().map { it.toString() }.toTypedArray()

        if (firstDigitPos != -1) {
            val firstDigit = lineArray[firstDigitPos].toInt()

            val lastDigitPos = inputLine.indexOfLast { it.isDigit() }
            val lastDigit = lineArray[lastDigitPos].toInt()

            val lineTotalCharacters = "$firstDigit" + "$lastDigit"
            val lineTotal = lineTotalCharacters.toInt()

            total += lineTotal
        }

    }

    // Part 1 Answer
    total.println()

}
