fun main() {
    print("masukan nilai x :")
    var x = readLine()!!.toInt()
    print("masukan nilai y :")
    var y = readLine()!!.toInt()

    val temp: Int

//    Nilai variabel sebelum ditukar
    println("Nilai x sebelum ditukar: $x")
    println("Nilai y sebelum ditukar: $y")
    println("")

//    Proses menukar nilai

    temp = x
    x = y
    y = temp

//    Nilai variabel setelah ditukar
    println("nilai x setelah ditukar: $x")
    println("nilai y setelah ditukar: $y")

}