Correct answer in Kotlin 1.1: **a) NumberFormatException**

* `Queue.peek()` is not blocking, but returns null
* Because it is defined in Java, Kotlin doesn't know if it is nullable or not
* `toInt()` is implemented as `Integer.parseInt()` that throws NumberFormatException in case of null

> As of Kotlin 1.2, compiler generates null-checking assertion,
> making this code throw `IllegalStateException`
