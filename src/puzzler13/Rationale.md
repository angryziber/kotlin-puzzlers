Correct answer: **d) IllegalStateException**

* Kotlin cannot guarantee null-safety on in-out with Java
* For convenience, return types from Java are neither nullable nor not null
* kotlinc adds lots of runtime checks to avoid errors propagating too far
