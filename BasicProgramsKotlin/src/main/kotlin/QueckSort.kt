

fun main(args:Array<String>){

    var arr= arrayOf(1,3,5,6,8,3,9,0)
    var len=arr.size;
    queckSort(arr,0,len-1);

    for(i in 0..arr.size-1)
    print(" "+arr[i]);
}

fun queckSort(arr: Array<Int>, low: Int, high: Int) {

    if(low<high){
        var index=partition(arr,low, high)

        queckSort(arr,low,index-1)
        queckSort(arr,index+1,high)

    }

}

fun partition(arr: Array<Int>, low: Int, high: Int): Int {
    var pivote=arr[high]
    var pos=low-1

    for(i in low..high-1){
        if(arr[i]<=pivote){
            pos++
            var temp=arr[pos]
            arr[pos]=arr[i]
            arr[i]=temp
        }
    }
    var temp=arr[pos+1];
    arr[pos+1]=arr[high];
    arr[high]=temp

    return pos+1
}
