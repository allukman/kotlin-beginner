fun main() {
    divideAndSort(5956560159466056)

}

fun divideAndSort (angka: Long) {
    var numbers = angka.toString().split("0")
    var result = mutableListOf<String>()

    for (i in 0 until numbers.size){
        result.add(numbers[i].map { it }.sorted().joinToString(""))
    }
    println(result.joinToString(""))
}




