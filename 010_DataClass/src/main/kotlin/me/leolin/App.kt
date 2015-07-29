package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {

    var book: Book = Book("Kotlin", "JetBrains", 99.9)

    var bookOnSale = book.copy(price = book.price * 0.9)

    println(book)
    println(bookOnSale)

    println("${book.name}")
    println("${book.author}")
    println("${book.price}")

}


data class Book(var name: String, var author: String, var price: Double)

