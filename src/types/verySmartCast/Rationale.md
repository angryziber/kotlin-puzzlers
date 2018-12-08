Correct answer: **a) 123**

* Compiler does not check for *impossible* conditions
* Smart cast of `x` works for both Int and String at the same time
  * This should be useful when checking for interfaces
* Code compiles, but condition that would lead to ClassCastException is never true  

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 9:32](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=9m32s)
