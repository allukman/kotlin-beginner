fun main() {
    ganjilGenap()
}

fun ganjilGenap(){
    print("masukan angka: ")
    val angka = readLine()!!.toInt()

    if (angka % 2 == 0){
        println("$angka adalah bilangan genap")
    } else {
        println("$angka adalah bilangan ganjil")
    }
}