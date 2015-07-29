package me.leolin

/**
 * @author leolin
 */

fun main(args: Array<String>) {
    RequestExecutor().executeRequest(Request());
    RequestExecutor().executeRequest{
        println("Lambda")
    };
    RequestExecutor().executeRequest(object :Executable{
        override fun execute() {
            println("object")
        }

    })

    Thread {
        println("Run!")
    }.start()

    Thread(Runnable {
        println("Run!")
    }).start()


    C().foo()
    C().bar()
    D().foo()
    D().bar()
}

//--------------------------------------------------
interface Executable {
    fun execute()
}

class Request : Executable {
    override fun execute() {
        println("Request has been executed")
    }
}

class RequestExecutor {
    fun executeRequest(req: Executable) {
        req.execute()
    }

    fun executeRequest(req: () -> Unit) {
        req.invoke()
    }
}

//--------------------------------------------------
interface Foo {
    val order: Int
    fun bar()
}

class Foo1 : Foo {
    override val order = 1
    override fun bar() {
        throw UnsupportedOperationException()
    }
}

class Foo2 : Foo {
    override val order = 2
    override fun bar() {
        throw UnsupportedOperationException()
    }
}

//--------------------------------------------------
interface A {
    fun foo() { print("A") }
    fun bar()
}

interface B {
    fun foo() { print("B") }
    fun bar() { print("bar") }
}

class C : A {
    override fun bar() { print("bar") }
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
}