import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.superclasses

fun <T: Any> register(c: KClass<T>, i: T) {
  println("$i implements ${c.simpleName}")
}

listOf(ArrayList::class, HashMap::class).forEach {
  register(it, it.createInstance())
}

// What will it print?
// a) [] implements List; {} implements Map
// b) [] implements ArrayList; {} implements HashMap
// c) An exception
// d) Will not compile
