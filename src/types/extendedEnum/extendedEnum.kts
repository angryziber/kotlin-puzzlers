package types.extendedEnum
// by Dmitry Kandalov @dkandalov

enum class Color {
  Red, Green, Blue
}

fun Color.from(s: String) = when (s) {
  "#FF0000" -> Color.Red
  "#00FF00" -> Color.Green
  "#0000FF" -> Color.Blue
  else -> null
}

println(Color.from("#00FF00"))

// What will it print?
// a) Green
// b) Color.Green
// c) null
// d) will not compile
