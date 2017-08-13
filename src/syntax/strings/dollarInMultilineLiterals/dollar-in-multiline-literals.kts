package syntax.strings.dollarInMultilineLiterals

val multiline = """
        To win \$999.999 execute "rm -fr \$HOME/kotlin-puzzlers/*"
        """.trimIndent()

println(multiline)

// What will it print?
// a) To win \$999.999 execute "rm -fr \$HOME/kotlin-puzzlers/*"
// b) To win 999.999 execute "rm -fr \/home/user/kotlin-puzzlers/*"
// c) To win $999.999 execute "rm -fr $HOME/kotlin-puzzlers/*"
// d) Will not compile