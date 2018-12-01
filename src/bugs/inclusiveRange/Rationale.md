Correct answer: **a) in**

* In Kotlin < 1.1 the answer would be **b) !in**
* ClosedRange.contains() converts parameter into Int before checking
* This is most likely a stdlib bug and needs to be fixed

// Inspired by [AndroidPub](https://android.jlelse.eu/kotlin-beware-the-silent-cast-5fed4f4c4aa6)

Watch [KotlinConf 2017 - Kotlin Puzzlers by Anton Keks 38:57](https://www.youtube.com/watch?v=ukwVzLq_pHk&lc=UgzH3QiIn1vLhtL2M0Z4AaABAg#t=38m57s)
