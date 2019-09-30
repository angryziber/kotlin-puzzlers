Correct answer: **d) None of the above** - compiler crashes

https://youtrack.jetbrains.com/issue/KT-31135

It seems to be relate to the fact that 
1. the `+=` is operated on an immutable class (`String`) and the statement is re-written as `baz?.bar = baz?.bar + "test"` and 
2. The `plus` extension function on a `String` takes a *nullable* receiver: `operator fun String?.plus(other: Any?): String`

Rewriting it by hand, this bug goes away. It looks like the compiler messes up the re-write.

If the `plus`'s receiver were non-nullable, a compiler error would have been generated instead of it crashing.
