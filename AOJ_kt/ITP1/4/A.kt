fun main(){
    val (a, b) = readLine()!!.split(" ").map{it.toInt()}

    var d = a / b
    var r = a % b
    val f: Double = a.toDouble() / b.toDouble()

    println("$d $r %.5f".format(f))
}