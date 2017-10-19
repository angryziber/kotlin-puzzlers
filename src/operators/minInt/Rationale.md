Correct answer: **d) none of the above** - the code will not compile

* Kotlin has a problem with method calls on negative numbers
    * it calls methods on positive numbers, and only then applies the unary '-' operator
    * -2147483648 == Int.MIN_VALUE, would be perfectly fine
    * but 2147483648 is bigger than Int.MAX_VALUE, so it cannot be represented as an Int before negation
