fun main(){
    val listX = mutableListOf<Int>()
    val listY = mutableListOf<Int>()
    var cnt = 0

    while(true){
        val (x, y) = readLine()!!.split(" ").map{it.toInt()}
        if(x == 0 && y == 0) break
        else{
            listX.add(x)
            listY.add(y)
            cnt++
        }
    }

    for(j in 0..cnt-1){
        if(listX[j] < listY[j]) println("${listX[j]} ${listY[j]}")
        else println("${listY[j]} ${listX[j]}")
    }
}