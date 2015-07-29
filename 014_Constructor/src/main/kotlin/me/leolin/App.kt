package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    var person = Person("Hello")
    println(person.name)


    var computer = Computer()
    println(computer.cpuSpeed)


    var computer2 = Computer(2.3)
    println(computer2.cpuSpeed)

    println(SingletonBank.hashCode())
    println(SingletonBank.hashCode())
    Thread{
        println(SingletonBank.hashCode())
    }.start()

}


class Person(val name: String)

class Computer(var cpuSpeed: Double) {
    init {
        println("Computer init")
    }
    constructor() : this(2.0)
}

object SingletonBank {
    init {
        println("SingletonBank init")
    }
}