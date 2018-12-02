Correct answer: **d) Hello Kotlin, 2**

* `private val items` makes `Container.component2()` private.
* However, `public List<T>.component2()` is defined in kotlin-stdlib
* Container implements `List<Int>` by delegation, and therefore, the stdlib method is used.
* See [ticket](https://youtrack.jetbrains.com/issue/KT-24308) for the progress on an inspection.

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 35:54](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=35m54s)
