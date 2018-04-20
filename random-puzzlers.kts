import java.io.File
import kotlin.collections.shuffled

fun File.listAllFiles(): List<File> =
        this.listFiles()?.flatMap { it.listAllFiles() + it } ?: emptyList()

val puzzlers = File("src").listAllFiles()
        .filter { it.isFile }
        .filter { it.extension in listOf("kt", "kts") }

puzzlers.shuffled()
        .forEach { println(it) }
