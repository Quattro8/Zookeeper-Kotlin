// Necessary import
import java.util.*

// Create CellPhone class here:

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val brandName = scanner.nextLine()
    val version = scanner.nextLine()

    // Create and print CellPhone object here:
    print("The cell phone is a $brandName with version $version")
}