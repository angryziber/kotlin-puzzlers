package syntax.naughtyWhen
// by Ilya Gorbunov

fun f(x: Boolean) {
   when(x) {
       x == true -> println("$x TRUE")
       x == false -> println("$x FALSE")
   }
}

f(true)
f(false)

// What will it print?
// a) true TRUE; false FALSE
// b) true TRUE; false TRUE
// c) true FALSE; false FALSE
// d) none of the above
