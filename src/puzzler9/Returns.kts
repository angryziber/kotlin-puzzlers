package puzzler9

listOf(1, 2, 3).forEach {
  if (it > 2) return
  print(it)
}
print("ok")

// What will it print?
// a) 123ok
// b) 12ok
// c) 12
// d) Infinite loop
