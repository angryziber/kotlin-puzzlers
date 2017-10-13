Correct answer: **a) NumberFormatException**

* `Queue.peek()` is not blocking, but returns null
* Because it is defined in Java, Kotlin doesn't know if it is nullable or not
* `toInt()` is implemented as `Integer.parseInt()` that throws NumberFormatException in case of null