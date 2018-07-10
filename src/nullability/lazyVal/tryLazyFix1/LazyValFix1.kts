package nullability.lazyVal.tryLazyFix1

class Greeting(val word: String)

open class Father {

    init {
        sayGreeting()
    }

    open fun sayGreeting() = print("Luke! I'm your Father!!!")
}

class Leia : Father() {

    private val greeting: Greeting
        get() {
            if (field == null) {
                field = Greeting("I love you!")
            }
            return field
        }

    override fun sayGreeting() = println(greeting.word)

}

Leia()

// What will it print?
// a) I love you!
// b) Luke! I'm your Father!!!
// c) NullPointerException
// d) Will not compile
