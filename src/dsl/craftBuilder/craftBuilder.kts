package dsl.craftBuilder

data class Recipe(var name: String? = null, var hops: List<Hops> = mutableListOf())
data class Hops(var kind: String? = null, var atMinute: Int = 0, var grams: Int = 0)

fun beer(build: Recipe.() -> Unit) = Recipe().apply(build)
fun Recipe.hops(build: Hops.() -> Unit) { hops += Hops().apply(build) }

val recipe = beer {
  name = "Simple IPA"

  hops {
    name = "Cascade"
    grams = 100
    atMinute = 15
  }
}

println(recipe)

// What will it print?
// a) Recipe(name=Simple IPA, hops=[Hops(name=Cascade, atMinute=15, grams=100)])
// b) IllegalArgumentException
// c) will not compile
// d) none of the above
