import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.arguments.argument
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.types.path

class MiniGrep : CliktCommand(help = "Search for patterns in each FILES") {
    val keyword by argument()
    val path by argument().path(mustExist = true)
    val caseInsensitive by option("-i", "--ignore-case", help = "ignore case distinctions").flag()


    override fun run() {
        echo("searching for $keyword in $path when case-distinction is $caseInsensitive")
    }
}
