Correct answer: **c) nullnull**

* We trick the compiler using the EXACTLY_ONCE contract 
  (meaning that the lambda is called exactly once), but we don't do this.
* Kotlin compiler doesn't check if contract conforms with reality.
* The compiler still initializes the variable to null before the `runLambda()` 
  call, so `hello()` returns null
* `hello().plus(hello())` doesn't result in NPE because it is compiled into 
  `StringBuilder().append()`
