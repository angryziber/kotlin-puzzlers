// by David Blanc @speekha

val anExtremelyLongAndBoringStatementThatBarelyFitsOnALine = 2
val anotherExtremelyLongStatementThatBarelyFitsOnALine = 2
val someList = listOf(1)
val result = someList.map {
        anExtremelyLongAndBoringStatementThatBarelyFitsOnALine
            + anotherExtremelyLongStatementThatBarelyFitsOnALine
}
print(result)

// What will it print?
// a) [1]
// b) [2]
// c) [4]
// d) [1, 4]
