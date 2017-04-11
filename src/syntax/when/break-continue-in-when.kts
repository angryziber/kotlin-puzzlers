package syntax.`when`

fun printToPunctuation(str: String) {
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

printToPunctuation("1C2")
printToPunctuation("3B4")
printToPunctuation("5R6")


// What does it print?
// a) 12; 3; 5
// b) ConcurrentModificationException
// c) IllegalStateException
// d) Will not compile