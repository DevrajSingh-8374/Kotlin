fun main() {
    print("Enter the number of terms: ")
    val n = readLine()?.toIntOrNull() ?: return

    var first = 0
    var second = 1

    print("Fibonacci Series: $first, $second")

    for (i in 2 until n) {
        val next = first + second
        print(", $next")
        first = second
        second = next
    }
}
