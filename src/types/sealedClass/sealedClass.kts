package types.sealedClass

sealed class Animal {
  class Human : Animal()
  class Dog : Animal()
}

val h = Animal.Human() as Animal
when (h) {
  is Animal.Dog -> println("It is a Dog")
}

// Will it compile?
// a) No
// b) Yes
