Correct answer: **d) will not compile**

* Type of null is *Nothing?*
* Provided the defined *not* operators, an odd number of `!` will convert *null* to *Unit*
* But `!!` nullability assertion is applied before unary operators
* So the type of of `foo!!` is non-nullable *Nothing*
* *Nothing* is a *subtype* of anything, so compilation error is "overload ambiguity" for both *not* operators  

Suggested by [@guai](https://github.com/angryziber/kotlin-puzzlers/issues/31)

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 30:56](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=30m56s)
