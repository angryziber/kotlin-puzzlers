package syntax.manyReturns

fun isItSupposedToBeFun(condition: Boolean): String {
    return if (condition)
        return "yep. It's fun"
    else
        return "nope. Nothing special"
}

println(isItSupposedToBeFun(true))

// What will it print?
// a) yep. It's fun
// b) yep. It's fun and warning: unreachable code
// c) yep. It's funnope. Nothing special
// d) Compilation error: unreachable code
