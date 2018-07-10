Correct answer: **d) Hello Kotlin, 2**

* `private val items` makes `Container.component2()` private.
* However, `public List<T>.component2()` is defined in kotlin-stdlib
* Container implements `List<Int>` by delegation, and therefore, the stdlib method is used.
* See [ticket](https://youtrack.jetbrains.com/issue/KT-24308) for the progress on an inspection.