
    fun main(ars:Array<String>) {

        var arr = arrayOf(12,2,5,0,8,2,4,3,15)
        var len=arr.size
        var temp = 0
        for(i in 0..len-1){
            for(j in 0..len-2){
                if(arr[i]<arr[j]){
                    temp= arr[j]
                    arr[j]=arr[i]
                    arr[i]=temp
                }
            }
        }
        print(arr[len-2])
    }
