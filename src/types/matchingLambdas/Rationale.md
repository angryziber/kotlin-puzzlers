Correct answer **a) 1 and 2 on separate lines**

When restricting two types to be the same this way, the type inference will find the common base, which in this case, will be `Any`.
Both `Int` and `String` "extend" `Any` and hence can be assigned to it, not a problem.
After the method returns, `println(Any?)` will be called with one of the lambda's executed value.

Note: didn't yet find a way to make this restriction work as expected. That is to express "this `T` should be inferred based on call site, but it must be more specific than `Any`".

*Original gotcha background*:
I was using a similar signature to store stubbed responses for method calls, then picked one which worked: `setBehavior({ some.call() }, { /* real value calculation */ })`. I was expecting `some.call()`'s type to restrict what type the second `() -> T` can return. When reflectively matching these up the assumption of the second lambda returning the same type as the first blew up with `ClassCastException`, because the inference didn't restrict: `T` was `Any`.
