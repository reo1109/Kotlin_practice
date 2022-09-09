fun main(){
    var list = readLine()!!.split(" ").map(String::toInt)
    var a = list[0]
    var b = list[1]
    var c = list[2]

    if(a > b){
        var tmp = a
        a = b
        b = tmp

        if(a > c){
            tmp = a
            a = c
            c = tmp
        }
    }

    if(b > c){
        var tmp = b
        b = c
        c = tmp

        if(a > b){
            tmp = a
            a = b
            b = tmp
        }
    }

    println("$a $b $c")
}