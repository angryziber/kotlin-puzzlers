Correct answer: **d) None of the above (IllegalStateException)**

* Kotlin cannot guarantee null-safety on in-out with Java
* For convenience, return types from Java are neither nullable nor not null
* kotlinc adds lots of runtime checks to avoid errors propagating too far

* Explicitly declare nullable types that come from Java
* Kotlin could support Properties better, knowing that it is a Map
