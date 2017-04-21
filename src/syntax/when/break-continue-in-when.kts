package syntax.`when`

fun printFormatted(str: String) {
    for(ch in str) {
        when(ch) {
            'C' -> continue
            'R' -> return
            'B' -> break
        }
        print(ch)
    }

    print("; ")
}

printFormatted("1C2")
printFormatted("3B4")
printFormatted("5R6")


// What does it print?
// a) 12; 3; 5
// b) ConcurrentModificationException
// c) IllegalStateException
// d) Will not compile