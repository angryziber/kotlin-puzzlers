Correct answer **d) will not compile due to failed type inference**

* `in` and `out` are not conflicting because declaration-site and use-site variances are opposite
  * see [Kotlin docs](https://kotlinlang.org/docs/reference/generics.html) for the explanation  
* `Hipster()` cannot be called because T cannot be inferred
  * Unlike Java, Kotlin doesn't allow not inferred type parameters to be Any/Object
  