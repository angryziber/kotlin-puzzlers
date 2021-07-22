package interop.extendAtomicInteger
//by Mikhail Naftal

import java.util.concurrent.atomic.AtomicInteger

class MyAtomicInteger(value: Int = 0) : AtomicInteger(value) {
  override fun toString(): String = "My precious atomic " + super.toString()
}

print(MyAtomicInteger())


// What will it print?
// a) 0
// b) My precious atomic 0
// c) Runtime exception
// d) Will not compile
