Correct answer: **c) `StackOverflowError`**

Because sequences are lazy, the execution of `map` will be delayed until the terminal `toList()` function is called.
When that happens, `seq` has already been reassigned to the mapped version of itself. 

This means that the `seq` in `seq.sum()` inside the `map`-lambda will reference the new mapped version of the sequence.
This causes an infinite recursion, because `sum` (which also is terminal) will trigger a new `map`, which will trigger a `sum`, and so on.

There are (at least) two ways to fix it. 

* Don't reassign the variable, but create a new one instead:
```
val seq = sequenceOf(1)

val result = seq.map { seq.sum() }

println(result.toList())
```

* Capture the sequence in a new variable, which you can use inside `map`:
```
var seq = sequenceOf(1)
val capture = seq

seq = seq.map { capture.sum() }

println(result.toList())
```