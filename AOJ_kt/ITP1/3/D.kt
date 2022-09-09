fun main(){
    val (a, b, c) = readLine()!!.split(" ").map{it.toInt()}
    var cnt = 0

    for(j in a..b){
        if(c % j == 0) cnt++
    }
    println("$cnt")
}