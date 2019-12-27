//public class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
//internal class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
//private class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
class Person(val firstName: String = "Peter", val lastName: String = "Parker") {
    //internal var nickName: String? = null
    //protected var nickName: String? = null
    //private var nickName: String? = null
    var nickName: String? = null
        set(value) {
            field = value
            println("the new nickname is $value")
        }
        get() {
            println("the returned value is $field")
            return field
        }

    //private fun printInfo() {
    fun printInfo() {
//        val nickNameToPrint = if (nickName != null) nickName else "no nickname"
        val nickNameToPrint = nickName ?: "no nickname"
        println("$firstName ($nickNameToPrint) $lastName")
    }
//class Person(_firstName: String, _lastName: String) {
//    val firstName: String = _firstName
//    val lastName: String = _lastName

//    init {
//        firstName = _firstName
//        lastName = _lastName
//    }

//    init { // Always done first
//        println("init 1")
//    }
//
//    constructor() : this("Peter", "Parker") {
//        println("Secondary constructor")
//    }
//
//    init { // Always done first
//        println("init 2")
//    }

}