Correct answer: **a) Hello**

* The innermost `return` does it job and returns "Hello"
* In Kotlin everything (except assignment) is an expression
* `return` and `throw` expressions result in `Nothing`
* `Nothing` can never be instantiated, but is assignable to all other types
* That's why you can throw Nothing and return Nothing again, and even assign it to a variable

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 5:00](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=5m00s)
