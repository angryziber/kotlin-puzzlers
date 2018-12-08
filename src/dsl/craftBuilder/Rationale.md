Correct answer **d) none of the above**
`Recipe(name=Cascade, hops=[Hops(kind=null, atMinute=15, grams=100)])`

* Inner-scoped builders see the outer scope by default (name vs kind properties)
* Can be prevented by using @DslMarker:
    ```
    @DslMarker annotation class BeerLang
    @BeerLang data class Recipe/Hops...
    ```

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 18:30](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=18m30s)
