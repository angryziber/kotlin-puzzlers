Correct answer: **d) Will not compile**

* You might not notice, but there is a syntactic ambiguity. It will be more obvious if you replace `a -> A',  'b -> B, 'c -> bar`: foo(**bar<A, B>** d).
In Kotlin `c < a, b >` is expected to be class or function `c` with two type parameters `a` and `b`.  
* Workaround: `foo((c < a), b > d)`

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 33:14](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=33m14s)
