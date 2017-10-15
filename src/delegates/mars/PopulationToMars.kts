package delegates.mars
// by Daniil Vodopian @voddan

class Population(var cities: Map<String, Int>) {
    val `san francisco` by cities
    val `st petersburg` by cities
    val `tallinn` by cities
}

val population = Population(mapOf("san francisco" to 864_816, "st petersburg" to 5_281_579 , "tallinn" to 413_782))

/* Many years have passed, now all humans live on Mars */
population.cities = emptyMap()

with(population) {
    println("$`san francisco`; $`st petersburg`; $`tallinn`")
}

// What will it print?
// a) 0; 0; 0
// b) 864816; 5281579; 413782
// c) NullPointerException
// d) NoSuchElementException
