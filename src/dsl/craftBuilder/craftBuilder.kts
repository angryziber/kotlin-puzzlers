package dsl.craftBuilder

data class Recipe(var name: String? = null, var hops: List<Hop> = mutableListOf())
data class Hop(var kind: String? = null, var atMinute: Int = 0, var grams: Int = 0)

fun beer(build: Recipe.() -> Unit) = Recipe().apply(build)
fun Recipe.hop(build: Hop.() -> Unit) { hops += Hop().apply(build) }

val recipe = beer {
  name = "Simple IPA"

  hop {
    name = "Cascade"
    grams = 100
    atMinute = 15
  }
}

println(recipe)
