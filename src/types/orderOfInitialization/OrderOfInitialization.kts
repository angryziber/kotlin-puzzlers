class Message(val text: String)

sealed class Greeting(val message: Message) {
  object UniverseGreeting : Greeting(Message("Universe"))
  object WorldGreeting : Greeting(WORLD_MESSAGE)

  companion object {
    val DEFAULT = WorldGreeting
    val WORLD_MESSAGE = Message("World")
  }
}

fun printGreeting(greeting: Greeting?) {
  with(greeting ?: Greeting.DEFAULT) {
    print("Hello ${message.text}!")
  }
}

printGreeting(null)
printGreeting(Greeting.UniverseGreeting)

// What will it print?
// a) will not compile
// b) HelloWorld!HelloUniverse!
// c) NullPointerException
// d) ExceptionInInitializerError