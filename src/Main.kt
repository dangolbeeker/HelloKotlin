fun sayHello1(greeting:String, itemsToGreet: List<String>) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

fun sayHello2(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
//====================================================================================
//Named Arguments
fun greetPerson(greeting: String = "Default", name: String = "Default") = println("$greeting $name")


fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Java")
    val interestingThings2 = listOf("Kotlin", "Programming", "Java")
    sayHello2("Hallo", *interestingThings)
    println("=========================================================================")
    sayHello2("Hej", "Kotlin", "Java", "C#")
    println("=========================================================================")
    sayHello1("Hej", interestingThings2)
    println("=========================================================================")
    //================================================================================
    //Named Arguments
    greetPerson(greeting = "Hi", name = "Scott") // or switch
    greetPerson(name = "Scott", greeting = "Hi") // or only one argument
    greetPerson(name = "Scott") // or none
    greetPerson()
    sayHello2(greeting = "Hallo", itemsToGreet = *interestingThings)
}