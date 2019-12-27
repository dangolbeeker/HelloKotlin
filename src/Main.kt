// Basic function
fun sayHello(itemToGreet:String) {
    // val msg = "Hello " + itemToGreet
    val msg = "Hello $itemToGreet"
    println(msg)
}
// Single expression function using a String Template
fun sayHellov2(itemToGreet:String) = println("Hello $itemToGreet")

// Single expression function using multiple parameters as a String Template
fun sayHellov3(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

// Default main function
fun main() {
    sayHello(itemToGreet = "Kotlin")
    sayHello(itemToGreet = "World")
    sayHellov2(itemToGreet = "Kotlin")
    sayHellov2(itemToGreet = "World")
    sayHellov3(greeting = "Hey", itemToGreet = "Kotlin")
    sayHellov3(greeting = "Hello", itemToGreet = "World")
}