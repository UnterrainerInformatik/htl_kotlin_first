package info.unterrainer.kotlin.second.info.unterrainer.kotlin.second.items

import info.unterrainer.kotlin.second.Utils
import info.unterrainer.kotlin.second.items.Person

class RestaurantCustomer(name: String, val dish: String) : Person(name), FoodConsumer {
    var utils = Utils();

    fun order() = println(utils.addSomething("$dish, please!"))
    override fun eat() = println("*Eats $dish*")
    override fun greet() = println("It's me, $name.")
}