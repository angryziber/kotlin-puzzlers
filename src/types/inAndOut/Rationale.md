Correct answer **d) will not compile due to failed type inference**

* Hipster is contravariant to T (in == consumer), but immutable Collection is covariant to T (out == producer)
  * There is no conflict here
* However, MutableSet is invariant to T (in/out, both consumer and producer)
  * So no collections can be stored inside of Hipster without @UnsafeVariance annotation  
  
See [Kotlin docs](https://kotlinlang.org/docs/reference/generics.html) for more info  
