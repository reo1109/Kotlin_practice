fun main(){
    val n = readLine()!!.toInt()
    var num = 1

    while(num <= n){
        var x = num
        if(x % 3 == 0) print(" $num")
        else{
            while(x > 0){
                if(x % 10 == 3){ 
                    print(" $num") 
                    break;
                }
                x /= 10
            }
        }
        num++
    }
    println("")
}
