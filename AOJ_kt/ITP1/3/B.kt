fun main(){
    val list = mutableListOf<Int>()
    var cnt = 0

    while(true){
        val num = readLine()!!.toInt()
        if(num == 0) break
        else {
            list.add(num)
            cnt++
        }
    }

    for(j in 0..cnt-1){
        println("Case ${j+1}: ${list[j]}")
    }
}