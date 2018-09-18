// A bonus
val n = Nothing::class.java.declaredConstructors[0]
        .apply { isAccessible = true }.newInstance()
println(n)
