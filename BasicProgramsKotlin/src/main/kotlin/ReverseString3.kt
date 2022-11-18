fun reverse(str: String): String {
    var reverse = ""

   /* for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }
*/

    for (i in str.length-1 downTo   0) {
        reverse += str[i]
    }
    return reverse
}

fun main() {
    var str = "Hello"

    var reverse = reverse(str)

    println(reverse)        // olleH
}