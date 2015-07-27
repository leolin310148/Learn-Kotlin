package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    cases(123)
    cases("abc")
    cases(Object())
}

fun cases(obj: Any) {
    when (obj) {
        is Number -> println("obj is number and value is $obj")
        is String -> println("obj is String and value is $obj , length is ${obj.length()}")
        else -> println("obj is ${obj.javaClass}")
    }
}