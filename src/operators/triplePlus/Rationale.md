Correct answer: **c) 1  2 -3**

* The real operator Int.plus() hides the extension function
* The real one is not *infix*, so only for infix variant our extension is used
* Unary *-* is applied before operator and infix usage, but after the normal function call

Inspired by [zhangdatou](https://discuss.kotlinlang.org/t/1-plus-2-3/2182)

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 23:49](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=23m49s)
