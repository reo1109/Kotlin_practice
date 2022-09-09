fun main(){
    val list = readLine()!!.split(" ").map(String::toInt)
    if(list[0] < list[1]) println("a < b")
    else if(list[0] > list[1]) println("a > b")
    else println("a == b")
}