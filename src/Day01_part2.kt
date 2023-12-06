import java.io.InputStream
import java.util.TreeMap

fun main() {

    val inputStream = readInputStream("day1_input")
    val total = getNumbersAsWordsFirst(inputStream)
    total.println()
}

fun getNumbersAsWordsFirst(inputStream: InputStream) : Int {

    var total = 0

    // Create map of starting positions for each string
    val numberTextList = mapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
        "five" to 5,
        "six" to 6,
        "seven" to 7,
        "eight" to 8,
        "nine" to 9,
    )

    inputStream.bufferedReader().forEachLine { inputLine ->

        val numbersPositionHashmap = TreeMap<Int, Int>()

        val firstDigitPos = inputLine.indexOfFirst { it.isDigit() }

        if (firstDigitPos != -1) {
            val lineArray: Array<String> =
                inputLine.toCharArray().map { it.toString() }.toTypedArray()

            val firstDigit = lineArray[firstDigitPos].toInt()

            val lastDigitPos = inputLine.indexOfLast { it.isDigit() }
            val lastDigit = lineArray[lastDigitPos].toInt()

            numbersPositionHashmap[firstDigitPos] = firstDigit
            numbersPositionHashmap[lastDigitPos] = lastDigit
        }

        numberTextList.keys.forEach { numberWord ->

            var startingIndex = 0

            for (i in inputLine.indices) {

                val indexOfNumberWord = inputLine.indexOf(numberWord, startingIndex)

                if (indexOfNumberWord != -1) {
                    numbersPositionHashmap[indexOfNumberWord] = numberTextList[numberWord]!!
                    startingIndex = indexOfNumberWord + 1
                }
            }
        }

        val firstNumber = numbersPositionHashmap[numbersPositionHashmap.keys.min()]
        val lastNumber = numbersPositionHashmap[numbersPositionHashmap.keys.max()]

        val lineTotalCharacters = "$firstNumber" + "$lastNumber"

        val lineTotal = lineTotalCharacters.toInt()

        total += lineTotal
    }

    // Part 2 Answer
    return total
}
