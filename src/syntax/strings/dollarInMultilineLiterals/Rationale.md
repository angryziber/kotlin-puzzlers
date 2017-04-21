Correct answer: **d) Will not compile**

It is because the *only* special character in a multiline literal is `$`, and it can't be screened. 

If you need a string like `"""$HOME"""` without it resolving to a variable `HOME`, use `${'$'}` instead of `$`. 

An improvment over this is importing `import kotlin.text.Typography.dollar`:

    import import kotlin.text.Typography.dollar

    val str = """$dollarHome"""
