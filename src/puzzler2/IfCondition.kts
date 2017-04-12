package puzzler2

fun ifItIsSupposedToBeFun(condition: Boolean): String {
    return if (condition)
        return "yep. It's fun"
    else
        return "nope. Nothing spacial"
}

print(ifItIsSupposedToBeFun(true))


// What will it print?
//a) yep. It's fun
//b) yep. It's fun and warning: unreachable code
//c) Compilation error: unreachable code
//d) yep. It's funnope. Nothing spacial