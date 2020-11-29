fun main() {
    println(hitungLuasLingkaran(7))
    println(hitungLuasLingkaran(21))
    println(hitungLuasLingkaran(20))
}

fun hitungLuasLingkaran (r: Int): Double {
    var pi = 3.14
    var luas = pi * r * r
    return luas
}