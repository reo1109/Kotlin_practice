fun main(){
    val r = readLine()!!.toDouble()
    val pi = Math.PI

    val a = r * r * pi
    val c = 2 * r * pi

    print("%.6f ".format(a))
    println("%.6f".format(c))
}