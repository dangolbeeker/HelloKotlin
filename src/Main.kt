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
// create an instance of the Class Person

    val person = Person(firstName = "Scott", lastName = "Beeker")

    //No Getter Property access syntax
    person.lastName
    person.firstName
}