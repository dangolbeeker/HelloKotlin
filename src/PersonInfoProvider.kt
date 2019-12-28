fun main()
{
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    provider.getSessionId()
    checkTypes(provider)
    println("""""""""""""""""""""""""""""""""""""""""""""""""""""")
}

interface PersonInfoProvider
{
    val providerInfo: String
    fun printInfo(person: Person)
    {
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider
{
    fun getSessionId(): String
}

// add to interfaces to a class
open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider
{
    override fun getSessionId(): String
    {
        return "SessionId"
    }

    override val providerInfo: String
        get() = "udemy.BasicInfoProvider"
}


// checks which types
fun checkTypes(infoProvider: PersonInfoProvider)
{
    if (infoProvider !is SessionInfoProvider)
    {
        println("not a session info provider")
    } else
    {
        println("is a session info provider")
        //(infoProvider as udemy.SessionInfoProvider).getSessionId() // or
        infoProvider.getSessionId()
    }
}