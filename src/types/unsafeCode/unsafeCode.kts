// by Grigorii Yurkov @rpuxa

import sun.misc.Unsafe

fun unsafeCode(): String {
  val unsafe =
    Class.forName("sun.misc.Unsafe")
      .declaredFields
      .first { it.name == "theUnsafe" }
      .apply { isAccessible = true }
      .get(null) as Unsafe
  unsafe.allocateInstance(Nothing::class.java) as Nothing
}

println(unsafeCode())

// What will it print?
// a) kotlin.Nothing
// c) null
// c) Will not compile
// d) None of the above