package collections.mapContains

import java.util.Properties

val friendsMap = Properties()
friendsMap["John"] = "Jane"
friendsMap["Jane"] = "Dave"

"John" in friendsMap
"Jane" in friendsMap
"Dave" in friendsMap

// What will the results be?
// a) true true true
// b) false false false
// c) true true false
// d) false true true
