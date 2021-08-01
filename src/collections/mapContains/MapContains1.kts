package collections.mapContains

import java.util.concurrent.ConcurrentHashMap

val scores = ConcurrentHashMap<String, Int>()
scores["Steve"] = 9
scores["Rachel"] = 11

val scoresHigherThan10 = scores.filterValues { it > 10 }

scores.contains("Steve")
scores.contains("Rachel")

scoresHigherThan10.contains("Steve")
scoresHigherThan10.contains("Rachel")

// What will the results be?
// a) true true true true
// b) false false false false
// c) false false false true
// d) true true false true
