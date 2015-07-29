package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 5 && j == 5) {
                break@loop
            }

            println("i=$i,j=$j")
        }
    }

    println("-------")
    println(foo())
    println("-------")
    println(foo1())
    println("-------")
    println(foo2())
    println("-------")
    println(foo3())
}

fun foo() {
    intArrayOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit
        println(it)
    }
}

fun foo1() {
    intArrayOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return@forEach
        println(it)
    }
}

fun foo2() {
    intArrayOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return
        println(it)
    }
}


fun foo3() {
    intArrayOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return
        println(value)
    })
}
