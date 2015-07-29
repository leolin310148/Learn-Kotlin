package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    val strings = listOf("A", "B", "C")

    println(String.join(":", strings))

    Foo().bar()
    Foo.bar()
}


fun String.Companion.join(delimiter: String, iterable: Iterable<String>): String {
    var del = ""
    var sb = StringBuilder()
    iterable.forEach {
        sb.append(del).append(it)
        del = delimiter
    }
    return sb.toString()
}


class Foo {
    companion object {
    }

    fun bar() {
        println("bar")
    }
}

fun Foo.bar() {
    println("extension")
}

fun Foo.Companion.bar() {
    println("Companion extension")
}