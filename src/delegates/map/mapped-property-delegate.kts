package p10_mappedDelegates

class Population(var cities: Map<String, Int>) {
    val tallinn by cities
    val kronstadt by cities
    val st_petersburg by cities
}

val population = Population(mapOf(
    "st_petersburg" to 5_281_579,
    "tallinn" to 407_947,
    "kronstadt" to 43_005
))

/* Many years have passed, now all humans live on Mars */
population.cities = emptyMap()

with(population) {
    println("$tallinn; $kronstadt; $st_petersburg")
}

// What will it print?
// a) 0; 0; 0
// b) 407947; 43005; 5281579
// c) NullPointerException
// d) NoSuchElementException
