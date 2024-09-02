fun main() {
    val a: String = "hello"
    val b: String = a as String // UnSafe casting
    println(b)

    // Unsafe cast (commented out because it will cause a crash)
    // val c: Int = a as Int // Will throw ClassCastException

    // Safe casting with nullable type
    val d: Int? = a as? Int // Will result in 'null'
    println(d) // Prints 'null'
}