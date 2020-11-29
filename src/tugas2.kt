fun main() {
//    Menggunakan Math operation
    print("masukan nilai x :")
    var x = readLine()!!.toInt()
    print("masukan nilai y :")
    var y = readLine()!!.toInt()

    println("nilai x sebelum diubah: $x")
    println("nilai y sebelum diubah: $y")

    x = x + y
    y = x - y
    x = x - y

    println("")
    println("nilai x sekarang: $x")
    println("nilai y sekarang: $y")

//    Menggunakan bitwise operator
//    print("masukan nilai a :")
//    var a = readLine()!!.toInt()
//    print("masukan nilai b :")
//    var b = readLine()!!.toInt()
//
//    println("")
//    println("nilai a sebelum diubah: $a")
//    println("nilai b sebelum diubah: $b")
//
//    a = a xor b
//    b = a xor b
//    a = a xor b
//
//    println("")
//    println("nilai a adalah: $a")
//    println("nilai b adalah: $b")
}