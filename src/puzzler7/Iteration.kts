package puzzler7

class MyInt(val int: Int) {
  operator fun plus(int: Int): Int {
    print("${this.int}+$int ")
    return this.int + int
  }

  operator fun compareTo(int: Int): Int {
    print("${this.int}<>$int ")
    return this.int - int
  }
}

fun Int.my() = MyInt(this)

val x = listOf(1.my(), 2.my(), 3.my())
println(x.filter { it >= 2 }.map { it + 1 })

// What will it print
// a) 1<>2 2<>2 2+1 3<>2 3+1 [3, 4]
// b) 1<>2 2<>2 3<>2 2+1 3+1 [3, 4]
// c) 1+1 2+1 3+1 1<>2 2<>2 3<>2 [3, 4]
// d) order is not deterministic
