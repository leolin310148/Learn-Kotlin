package me.leolin

import java.util.Arrays

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    val list = Arrays.asList(1, 2, 3)

    println("list : [${list[0]},${list[1]},${list[2]}]")


    val text = """
for (c in "foo")
    print(c)
            """
    println(text)

    val s = "abc"
    println("$s.length is ${s.length()}")

    val a = 10
    val b = 15
    println("the bigger one is ${if (a > b) "a:$a" else "b:$b"}")
}