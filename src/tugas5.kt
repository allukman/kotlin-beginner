fun main() {
    hitungLuasSegitiga(4,8)
    hitungLuasSegitiga(2,6)
}

fun hitungLuasSegitiga(alas: Int, tinggi: Int): Unit {
    var luas = (alas * tinggi) / 2
    return println("luas segitiga dengan alas: $alas dan tinggi: $tinggi adalah $luas")
}