fun main() {
    printTriangle(5)

}

fun printTriangle(num: Int){
    for(i in num downTo 1){
        for (j in  1..i){
            print(j)
        }
    println()
    }
}

