sealed interface CardType

data class FiveOfAKind(val hand: String, val value: Int) : CardType
data class FourOfAKind(val hand: String, val value: Int) : CardType
data class FullHouse(val hand: String, val value: Int) : CardType
data class ThreeOfAKind(val hand: String, val value: Int) : CardType
data class TwoPair(val hand: String, val value: Int) : CardType
data class OnePair(val hand: String, val value: Int) : CardType
data class HighestCard(val hand: String, val value: Int) : CardType

// 32T3K 765
// T55J5 684
// KK677 28
// KTJJT 220
// QQQJA 483

fun main() {

    // Create linkedhashmap of hands to value
    // Add all rows into data classes based on what kind of hand they are

    // Filter down and use when statement
    // Are Filter down from 5 of a kind - count 5 the same
    // Are Filter down from 4 of a kind - count 4 the same
    // Has 3 of a kind with  two of a kind
    // Has 3 of a kind
    // Has 2 pairs
    // Has 1 pair
    // Highest card

    // Once determined then add to correct list

    // Loop round the lists







    //


    // End up with seven lists

    // For each list type get the size of the list

    // Loop round the list



    // Add each

    // After

    // Have a map of hands orders to list of card hands data classes
    // Loop through




    // Add each to a list

    // Put all values into a map





    // Determine kind and return data class
    // Associate by rank
    // descending


    // Determine 5 of a kind
    // Determine 4 of a kind
    // Determine full house
    // Determine 3 of a kind
    // Determine 2 pair
    // Determine 1 pair
    // Determine highest card


    // Compare


}