fun main(){
    val list = readLine()!!.split(" ").map(String::toInt)

    var W = list[0]
    var H = list[1]
    var x = list[2]
    var y = list[3]
    var r = list[4]
    var flag = 0

    if(x + r > W) flag = 1
    else if(x - r < 0) flag = 1
    else if(y + r > H) flag = 1
    else if(y - r < 0) flag = 1

    if(flag == 0) println("Yes")
    else println("No")
}