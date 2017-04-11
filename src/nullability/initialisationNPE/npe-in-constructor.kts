package nullability.initialisationNPE

import java.util.*

abstract class NullSafeLang {
    abstract val name: String
    val logo = name[0].toUpperCase()
}

class Kotlin : NullSafeLang() {
    override val name = "Kotlin"
}


print(Kotlin().logo)

// What will it print?
// a) K
// b) Kotlin
// c) NullPointerException
// d) Will not compile
