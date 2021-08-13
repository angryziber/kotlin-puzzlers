package collections.mapContains

import java.util.concurrent.ConcurrentHashMap

val scores = ConcurrentHashMap<String, Int>()
scores["Steve"] = 9
scores["Rachel"] = 11

val scoresHigherThan10 = scores.filterValues { it > 10 }

println(scores.contains("Steve"))
println(scores.contains("Rachel"))

println(scoresHigherThan10.contains("Steve"))
println(scoresHigherThan10.contains("Rachel"))

// What will the results be?
// a) true true true true
// b) true true false false
// c) false false false true
// d) true true false true
