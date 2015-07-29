package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    val (name, age) = Person("Leo", 27)
    println(name)
    println(age)

    val people = listOf(Person("Leo", 27), Person("Jason", 45))
    for ((name, age) in people) {
        println("$name is $age years old.")
    }
    for (p in people) {
        println("${p.name} is ${p.age} years old.")
    }

    val (lat, lng) = getLocation()
    println("$lat,$lng")
}

data class Person(val name: String, val age: Int)


data class Location(val lat: Double, val lng: Double)

fun getLocation(): Location {
    return Location(123.45678, 24.123414)
}