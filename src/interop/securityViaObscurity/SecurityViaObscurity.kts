package interop.securityViaObscurity

import kotlin.reflect.jvm.javaMethod

class InternalFromJava {
  internal fun hello() = "world"
}

println(InternalFromJava::hello.javaMethod?.name)

// What will it print?
// a) hello
// b) world
// c) null
// d) none of the above
