package types.sealedClass

sealed class Animal

class Human : Animal()
class Dog : Animal()

fun test_sealed_class_exhaustiveness() {
    val h = Human() as Animal
    when (h) {
        is Dog -> println("It is a Dog")
    }
}

//Will it compile?
//a) No
//b) Yes
