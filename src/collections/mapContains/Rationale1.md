Correct answer: **c) false false false true**

`java.util.concurrent.ConcurrentHashMap` defines a `contains(Object)` method which checks if a **value** is contained.
Therefore, the first two calls return `false`.  
The `filterValues` call is just a decoy; important here is that the result is `Map` and therefore the `contains` calls
on it resolves to the Kotlin extension function `Map<K, V>.contains(K)`, as expected.

This came up [here](https://github.com/google/gson/issues/1773) where this behavior mismatch caused confusion.

[JDK-8268665](https://bugs.openjdk.java.net/browse/JDK-8268665) requests to deprecate this misleading `contains` method.
