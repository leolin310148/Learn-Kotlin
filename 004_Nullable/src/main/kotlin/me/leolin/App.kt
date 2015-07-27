package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    //    var length:Int
    var length: Int?

    var s: String?;
    s = null

    println(s?.length())
    println(s?.length() ?: -1)
    length = s?.length()
    println(length)
    println(length ?: -1)


    s = "abc"


    length = s.length()
    println(length)
}