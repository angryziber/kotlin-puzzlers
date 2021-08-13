Correct answer: **d) false true true**

`java.util.Hashtable` (and its subclass `Properties`) defines a `contains(Object)` method which checks if a **value**
is contained. Therefore, Kotlin's `in` operator uses that method instead of the Kotlin extension function
`Map<K, V>.contains(K)`.

This has been reported as [KT-48007](https://youtrack.jetbrains.com/issue/KT-48007);
the same issue for `ConcurrentHashMap` has been fixed in the past, see [KT-18053](https://youtrack.jetbrains.com/issue/KT-18053).
For that class the compiler emits an error when `in` is used.

The fact that `Hashtable.contains(Object)` behaves counterintuitively was also used as puzzle in
["Java Puzzlers, Strange Loop Edition" by Bob Lee and Josh Bloch (2013)](https://youtu.be/qRTIpyd_snc?t=63).
