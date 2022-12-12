

fun main(array: Array<String>){
     var n=50
     var count=2         // '0' and '1' are not prime numbers
     var isPrime:Boolean;

     print("$count to $n prime numbers are: ")
     while (count<=n){
         isPrime=true
         for (i in 2..count/2){
             if(count%i == 0){
                 isPrime=false
                 break
             }
         }
         if(isPrime){
            print("$count ")
         }
         count=count+1
     }
 }