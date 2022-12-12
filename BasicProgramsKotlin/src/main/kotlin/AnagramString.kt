
fun main(array: Array<String>){
        var s1 = "listen"
        var s2 = "silent"

        var str1 = s1.lowercase()
        var str2 = s2.lowercase()
        var seetr2=str1.equals("k")

        if (str1.length != str2.length){
            println("$str1 and $str2 are not a Anagram")
            return
        }

        for (j in 0 until str1.length) {
            if (!str1.contains("" + str2[j])) {
                println("$str1 and $str2 are not a Anagram")
                return
            }
        }

        println(str1 + " and " + str2 + " are Anagram")

}