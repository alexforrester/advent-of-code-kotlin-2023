sealed interface CardHands

@JvmInline
value class FiveOfAKind(val hand: String) : CardHands

@JvmInline
value class FourOfAKind(val hand: String) : CardHands

@JvmInline
value class FullHouse(val hand: String) : CardHands

@JvmInline
value class ThreeOfAKind(val hand: String) : CardHands

@JvmInline
value class TwoPair(val hand: String) : CardHands

@JvmInline
value class OnePair(val hand: String) : CardHands

@JvmInline
value class HighestCard(val hand: String) : CardHands

fun main() {

    // Determine 5 of a kind
    // Determine 4 of a kind
    // Determine full house
    // Determine 3 of a kind
    // Determine 2 pair
    // Determine 1 pair
    // Determine highest card


}