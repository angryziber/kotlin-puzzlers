Correct answer: **d) None of the above** - the code never finishes

Returning COROUTINE_SUSPENDED (used only in library functions) implies coroutine suspension, 
even though you use withTimeout() coroutine launcher it will never finish.
