package bugs.compareMuch
// by @DeveloperHacker

import java.util.Random

val rnd = Random()

val a = rnd.nextInt()
val b = rnd.nextInt()
val c = rnd.nextInt()

fun whoWon(vararg conds: Boolean) = conds.all { true == it }

println(whoWon(a < b, b > c))

// What will it print?
// a) true
// b) false
// c) IllegalArgumentException
// d) will not compile
