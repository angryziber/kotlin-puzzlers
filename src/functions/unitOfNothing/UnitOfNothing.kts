package functions.unitOfNothing

fun oops() {
  return throw throw return
}

print(oops())

// What will it print?
// a) kotlin.Nothing
// b) kotlin.Any
// c) kotlin.Unit
// d) will not compile
