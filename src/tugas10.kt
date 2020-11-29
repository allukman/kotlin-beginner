fun main() {
    printWords("arkademy")
}
fun printWords(kata: String) {
    for (filter in kata){
        if (filter == 'a' || filter == 'e' || filter == 'i' || filter == 'o' || filter == 'u'){
            println(filter)
        } else {
            continue
        }
    }
    for (filter in kata){
        if (filter == 'a' || filter == 'e' || filter == 'i' || filter == 'o' || filter == 'u'){
            continue
        }
        println(filter)
    }
}

