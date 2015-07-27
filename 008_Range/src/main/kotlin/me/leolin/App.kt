package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    var score = 90
    var grade: String

    if (score in 90..100) {
        grade = "A"
    } else if (score in 80..89) {
        grade = "B"
    } else if (score in 70..79) {
        grade = "C"
    } else {
        grade = "D"
    }

    println("Gradle is $grade")


    for (i in 1..10) {
        println(i)
    }

    val s = "This is a book"
    for (i in 0..s.length() - 1) {
        println(s.charAt(i))
    }
}
