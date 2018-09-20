package properties.initOpenProperty

interface A {
    var a: Int
}

class AJunior : A {
    override var a: Int

    init {
        a = 3
    }
}

print(AJunior().a)

// What will it print?
// a) 0
// b) 3
// c) IllegalStateException
// d) Will not compile