package me.leolin

import java.util.Arrays

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    var list = Arrays.asList("Jhon", "Jason", "Mary", "Leo", "Tina", "Java", "Justin")
    for (s in list) {
        println(s)
    }

    println("-------")

    list.filter { it.startsWith("J") }
            .map { it.toUpperCase() }
            .sortBy { it }
            .forEach { println(it) }


    println("-------")

    val map = hashMapOf(1 to "A", 2 to "B", 3 to "C")

    for ((k, v) in map) {
        println("$k : $v")
    }

    map.filter { it.key >= 2 }
    .forEach {  }
}
