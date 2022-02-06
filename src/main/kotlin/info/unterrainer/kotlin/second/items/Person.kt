package info.unterrainer.kotlin.second.items

abstract class Person(val name: String) {
    open fun greet() {
        println("It's a me, $name.")
    }
}