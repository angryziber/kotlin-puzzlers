Correct answer: **d) zero; positive**

* Remember that the `else if` construct is really just calling `else` with
  a "single-line" `if`, which is the rest of your expression
* In Kotlin, functions are resolved before if-else blocks
* So the `.let { print(it) }` is only applying to the final `else if` and
  `else` branches
* So in this case, the result of the first `if` statement will not be used and
  the function will return immediately
* To avoid this situation, you can wrap the entire `if ... else ...` in parens,
  and then chain `.let` on it

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 36:08](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=36m08s)
