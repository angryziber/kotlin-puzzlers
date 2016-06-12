class Smart {
  var prop: String? = "abc"

  fun run() {
    var local: String? = "def"
    if (local != null) println(local?.substring(1, 2))

    if (prop != null) println(prop?.substring(1, 2))

    prop?.let {
      print(it.substring(1, 2))
    }
  }
}

fun main(args: Array<String>) {
  Smart().run()
}
