Correct answer: **b) NullPointerException**

We trick the compiler using the AT_LEAST_ONCE contract (it means that lambda must be called at least once, but we don’t do this). 
Due to this getNothing() function returns null with no exception. 
Then compiler looks at the main function and thinks: 
"Hmm... getNothing() returns Nothing, but its impossible without throwing an exception. 
In this case I will remove all instructions after getNothing() invocation, because they are redundant, and write "throw null" instead of "return"