

fun main(array: Array<String>){
    var n = 123456789
    var r=Int
    var result:Int =0

    println("$n")
    while(n>0){
        result = result * 10 + n % 10
        n= n/10
    }
    println("After revers: $result")

}