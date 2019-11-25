Correct answer is **b) [Hello] NullPointerException** 

`T` implicitly infers to `Nothing` and if function returns `Nothing`, compiler inserts `throw null` after invocation. 
Why "throw null"? Because its shortest way to throw any exception.
