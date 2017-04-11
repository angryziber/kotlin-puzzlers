package delegates.map

class Population(var cities: Map<String, Int>) {
    val sydney by cities
    val boston by cities
    val munich by cities
}

val population = Population(mapOf("munich" to 1_450_381, "sydney" to 5_005_400 , "boston" to 4_732_161))

/* Many years have passed, now all humans live on Mars */
population.cities = emptyMap()

with(population) {
    println("$sydney; $boston; $munich")
}

// What will it print?
// a) 0; 0; 0
// b) 5005400; 4732161; 1450381
// c) NullPointerException
// d) NoSuchElementException
