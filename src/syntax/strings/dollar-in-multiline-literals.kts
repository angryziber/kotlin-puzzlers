package syntax.strings

val multiline = """
        To win \$999.999 ececute "rm -fr \$HOME/kotlin-puzzlers/*"
        """.trimIndent()

println(multiline)

// What will it print?
// a) To win \$999.999 ececute "rm -fr \$HOME/kotlin-puzzlers/*"
// b) To win 999.999 ececute "rm -fr \usr/root/kotlin-puzzlers/*"
// c) To win $999.999 ececute "rm -fr $HOME/kotlin-puzzlers/*"
// d) Will not compile