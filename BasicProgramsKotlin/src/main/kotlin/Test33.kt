
fun main(array: Array<String>){
    var str="asdfaadffss"
    var count=0
    var res=""

    for(i in 0..str.length-1){
        count=1
        var b=str.get(i)
        if(res.contains(b)){
            continue
        }
        for(j in 0..str.length-1){
            if(i!=j && str.get(i).equals(str.get(j))){
                count.plus(1)
            }
        }
        res=res+""+str.get(i)+count
    }

    print(res)
}

