Correct answer: **c) 2**

If you read this expression you may have thought the answer to be 5.  You may believe the `x` will coalesce to `0` due to the Elvis operator `x?:0`, and then proceed to add the `y`. This is not the case.

If `x` is `null` it will actually coalesce to `0 + y` which is the entire expression to the right of the Elvis operator.

Conversely if `x` has a value, the value of the expression `x?:0 + y` will be `x`.

One way this could have been clearer is to leverage cleaner formatting as shown below:

```kotlin
val sum = x ?: 0 + y
```

But if you are using the Elvis operator inside mathematical expressions (or operator overloads), you should group up the intended Elvis expression in parenthesis (PEMDAS) fashion.

```kotlin
val sum = (x?:0) + y
```

Watch [KotlinConf 2018 - Kotlin Puzzlers, vol 2 by Anton Keks 16:06](https://www.youtube.com/watch?v=Xq9vBZs0j-8&lc=UgzrxmtADpeVJWbzo-14AaABAg#t=16m06s)
