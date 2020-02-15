import java.util.concurrent.atomic.AtomicLong

val kton = object {
  var firstName = "Andrey"
  var lastName = "Breslav"
  val fullName get() = "$firstName $lastName"
}

println(kton.apply{lastName = "Kotlin"}.fullName)

// What will it print?
// a) Andrey Breslav
// b) Andrey Kotlin
// c) Will not compile
// d) An Exception
