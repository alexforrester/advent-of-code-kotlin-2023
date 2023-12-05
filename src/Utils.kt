import java.io.File
import java.io.InputStream
import java.math.BigInteger
import java.security.MessageDigest
import kotlin.io.path.Path
import kotlin.io.path.inputStream
import kotlin.io.path.readLines

/**
 * Reads lines from the given input txt file.
 */
fun readInput(name: String) = Path("src/$name.txt").readLines()

fun readInputStream(name: String) = Path("src/$name.txt").inputStream()

/**
 * Converts string to md5 hash.
 */
fun String.md5() = BigInteger(1, MessageDigest.getInstance("MD5").digest(toByteArray()))
    .toString(16)
    .padStart(32, '0')

/**
 * The cleaner shorthand for printing output.
 */
fun Any?.println() = println(this)


//val inputStream: InputStream =
//    File("/Users/alexforrester/repos/personal/advent-of-code-kotlin-2023/src/day1_input.txt").inputStream()
//
//inputStream.bufferedReader().forEachLine { inputLine -> }


//fun main() {
//    fun part1(input: List<String>): Int {
//        return input.size
//    }
//
//    fun part2(input: List<String>): Int {
//        return input.size
//    }
//
//    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)
//
//    val input = readInput("Day01")
//    part1(input).println()
//    part2(input).println()
//}

