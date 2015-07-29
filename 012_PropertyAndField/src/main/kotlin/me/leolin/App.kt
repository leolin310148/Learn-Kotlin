package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    val address = Address()
    println(address.city)

    address.validated = true
}

public class Address {
    public var city: String = "Tainan"
    public var country: String = "Taiwan"
    var validated: Boolean = false
}