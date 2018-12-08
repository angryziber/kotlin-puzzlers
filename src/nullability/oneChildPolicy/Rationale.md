Correct answer: ***b) in child1; in parent***

* `T.apply()` can be called on anything, including nulls
* `child1?.apply` with `?.` ensures that `lookup()` is called on the child itself, if it is non-null (which it is)
* `child2.apply` is called on nullable `Node`, so `lookup()` on it is impossible, therefore parent's `lookup()` is preferred
* Compiler/IDEA definitely needs an ambiguity warning here
* Use `also()` instead of `apply()`

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 14:32](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=14m32s)
