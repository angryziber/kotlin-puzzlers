Correct answer: **b) 123333**

* processing of sequences is lazily, so `forEach` called on a sequence itself performs its action for every single element one-by-one
* `generateSeq()` produces reference to the same mutable list on each `yield`
* `toList()` is a terminal operation, so it first collects all generated lists, but as they are mutating 
during collection on each generation step, in the end they all are the same - the last generated one
* Mutability is bad, m'kay? Fix is rather simple:
```kotlin
yield(result.toList())
```