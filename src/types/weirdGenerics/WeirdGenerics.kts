// by Grigorii Yurkov @rpuxa

fun <T> weirdPrint(a: ArrayList<in T>) =
    try {
        print(a) as T
    } catch (e: Throwable) {
        throw UnsupportedOperationException()
    }

weirdPrint(if (false) arrayListOf(42) else arrayListOf("Hello"))

// What will it print?
// a) [Hello]
// b) [Hello] NullPointerException
// c) [Hello] UnsupportedOperationException
// d) Will not compile

