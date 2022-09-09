fun main(){
    val list = readLine()!!.split(" ").map(String::toInt)

    println("${list[0] * list[1]} ${list[0] * 2 + list[1] * 2}")
}