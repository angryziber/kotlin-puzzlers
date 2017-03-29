package syntax.semicolons

import java.util.*

fun main(args: Array<String>) {
    while (false) {} println("No. They are optional")
    //vs
    while (true) {
    }
    println("The end.");
}

// Kotlin's FAQ: Are semicolons required?
// a) No. They are optional
// b) Compile error
// c) No. They are optional. The end.
// d) No. They are optional and then compile error