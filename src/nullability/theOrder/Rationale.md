Correct answer: **d) none of the above (NullPointerException)**

* `c.length` is accessed before `c` is initialized
* Kotlin compiler tries hard to avoid NPE, but sometimes it is not smart enough
* KNPE is another case - when you explicitly use `!!` to dereference a null
* This issue should eventually be caught by the compiler

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 11:39](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=11m39s)
