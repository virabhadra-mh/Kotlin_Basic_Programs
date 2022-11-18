
fun main(array: Array<String>){

    //SwapTwoNumber1()
    SwapTwoNumber2()

}

fun SwapTwoNumber2() {
    var a = 50
    var b = 100

    println("Given \na=$a \nb=$b")

    a= a * b
    b=a/b
    a=a/b
    println("After swap: a=$a & b=$b")
}

fun SwapTwoNumber1() {
    var a = 50
    var b = 100

    println("Given \na=$a \nb=$b")

    a= a+b
    b=a-b
    a=a-b
    println("After swap: a=$a & b=$b")
}
