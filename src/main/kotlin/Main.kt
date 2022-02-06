package info.unterrainer.kotlin.second

import info.unterrainer.kotlin.second.info.unterrainer.kotlin.second.items.RestaurantCustomer

fun main() {
    val sam = RestaurantCustomer("Sam", "Mixed salad")
    sam.greet() // An implementation of an abstract function
    sam.order() // A member function
    sam.eat() // An implementation of an interface function
    sam.pay(10) // A default implementation in an interface
}