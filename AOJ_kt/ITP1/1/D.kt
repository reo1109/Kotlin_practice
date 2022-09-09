fun main(){
    var s = readLine()!!.toInt()
    var t = s / 60
    s = s % 60
    val h = t / 60
    t = t % 60

    println("$h:$t:$s")
}