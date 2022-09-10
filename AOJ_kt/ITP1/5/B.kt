fun main(){
    val h = mutableListOf<Int>()
    var w = mutableListOf<Int>()
    var cnt = 0 
    while(true){
        var (a, b) = readLine()!!.split(" ").map{it.toInt()}

        if(a == 0 && b == 0) break;
        else{
            h.add(a)
            w.add(b)
            cnt++
        }
    }

    for(i in 0..cnt-1){
        for(j in 1..h[i]){
            for(k in 1..w[i]){
                if(j == 1 || j == h[i]) print("#")
                else if(k == 1 || k == w[i]) print("#")
                else print(".")
            }
            println("")
        }
        println("")
    }
}