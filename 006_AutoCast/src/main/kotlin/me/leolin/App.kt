package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    printLengthIfString("abc")
    printLengthIfString(123)
}

fun printLengthIfString(str: Any) {
    if (str is String) {
        println(str.length())
    } else {
        println("$str is not a string")
    }
}