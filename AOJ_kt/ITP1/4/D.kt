fun main(){
    readLine()
    val a = readLine()!!.split(" ").map{it.toLong()}
    println("${a.minOrNull()} ${a.maxOrNull()} ${a.sum()}")
}