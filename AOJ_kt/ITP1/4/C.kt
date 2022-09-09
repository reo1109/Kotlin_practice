fun main(){
    val ans = mutableListOf<Int>()
    var cnt = 0

    while(true){
        val (a, op, b) = readLine()!!.split(" ")
        var s: Int

        if(op == "?") break

        else{
            if(op == "+"){
                s = a.toInt() + b.toInt()
                ans.add(s)
            }
            else if(op == "-"){
                s = a.toInt() - b.toInt()
                ans.add(s)
            }
            else if(op == "*"){
                s = a.toInt() * b.toInt()
                ans.add(s)
            }
            else if(op == "/"){
                s = a.toInt() / b.toInt()
                ans.add(s)
            }
            cnt++
        }
    }

    for(i in 0..cnt-1){
        println("${ans[i]}")
    }

}