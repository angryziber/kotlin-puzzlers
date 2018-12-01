Correct answer: **d) none of the above** - the code will not compile

* Kotlin has a problem with method calls on negative numbers
    * it calls methods on positive numbers, and only then applies the unary '-' operator
    * -2147483648 == Int.MIN_VALUE, would be perfectly fine
    * but 2147483648 is bigger than Int.MAX_VALUE, so it cannot be represented as an Int before negation

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 6:06](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=6m06s)
