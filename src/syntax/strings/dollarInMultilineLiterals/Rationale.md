Correct answer: **g) None of the above**

It is because the *only* special character in a multiline literal is `$`, and it can't be screened. 

The *only way* to have a string like `"""$HOME"""` without it resolving to a variable `HOME` is to use `${'$'}` instead of `$`. 

An improvment over this is importing `import kotlin.text.Typography.dollar`:

    import import kotlin.text.Typography.dollar

    val str = """$dollarHome"""
