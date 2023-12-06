fun main() {

//    Card 1: 41 48 83 86 17 | 83 86  6 31 17  9 48 53
//    Card 2: 13 32 20 16 61 | 61 30 68 82 17 32 24 19
//    Card 3:  1 21 53 59 44 | 69 82 63 72 16 21 14  1
//    Card 4: 41 92 73 84 69 | 59 84 76 51 58  5 54 83
//    Card 5: 87 83 26 28 32 | 88 30 70 12 93 22 82 36
//    Card 6: 31 18 13 56 72 | 74 77 10 23 35 67 36 11


    val puzzleLines = readInput("Day04_test")
    var total = 0
    var cardMatches = 0

    val originalsCardMap = mutableMapOf<Int, Int>()

    puzzleLines.forEachIndexed { index, line ->
        originalsCardMap.put(index+1,cardMatches)
    }
    



    originalsCardMap.forEach { mapEntry ->

        2,
        3,
        4,
        5
    }




    total.println()

    // Separate lines after colon and then after delimiter |
    // take after :
    // subsring before |
    // substring after |
    // split the two strings using Charsequence.split(" ")

    // loop round each winning list number to check whether it's in the other list
    // double the result for every one and add to total count


}

private fun cardMatches(line: String): Int {

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
            } else {
                linePoints *= 2
            }
        }
    }
    return linePoints
}

