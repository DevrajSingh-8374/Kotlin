fun convertC(c: Int): Int {
    return (c * 9/5) + 32
}

fun convertF(f: Int): Int {
    return (f - 32) * 5/9
}

fun main() {
    val fahrenheit = convertC(90)
    val celsius = convertF(194)
    println(fahrenheit)
    println(celsius)
}
