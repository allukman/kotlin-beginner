fun main() {
    reserveWords("saya belajar javascript")
    reserveWords("saya")
}

fun reserveWords(words: String): Unit{
    var splitStr = words.split(" ")
    if (splitStr.size <= 1) {
        return println("kata harus lebih dari satu")
    } else {
        var hasil = ""
        var i = splitStr.size - 1
        for (i in i downTo 0) {
            hasil += splitStr[i]
            hasil += " "
        }

        return println(hasil)
    }
}