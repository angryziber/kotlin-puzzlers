package lambdas

fun hello(block: () -> Unit) = block()

inline fun helloInline(block: () -> Unit) = block()

inline fun helloNoInline(noinline block: () -> Unit) = hello(block)

inline fun helloCrossInline(crossinline block: () -> Unit) = Runnable { block() }.run()

fun main(args: Array<String>) {
  hello {
    println("hello")
    // return - impossible
  }

  hello({
    println("hello")
    // return - impossible
  })

  hello(fun() {
    println("hello")
    return
  })

  helloInline {
    println("hello")
    return
  }

  helloNoInline {
    println("hello")
    // return - impossible
  }

  helloCrossInline {
    println("hello")
    // return - impossible
  }
}