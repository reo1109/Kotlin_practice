fun main(){
    val list = readLine()!!.split(" ").map(String::toInt)

    if(list[0] < list[1] && list[1] < list[2]) println("Yes")
    else println("No")
}