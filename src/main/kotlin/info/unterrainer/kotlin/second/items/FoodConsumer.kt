package info.unterrainer.kotlin.second.info.unterrainer.kotlin.second.items

interface FoodConsumer {
    fun eat()
    fun pay(amount: Int) = println("Delicious! Here's $amount bucks!")
}