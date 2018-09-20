Correct answer **d) none of the above**
`Recipe(name=Cascade, hops=[Hops(kind=null, atMinute=15, grams=100)])`

* Inner-scoped builders see the outer scope by default (name vs kind properties)
* Can be prevented by using @DslMarker:
    ```
    @DslMarker annotation class BeerLang
    @BeerLang data class Recipe/Hops...
    ```
