fun main() {
    checkTahunKabisat(2000)
    checkTahunKabisat(8004)
    checkTahunKabisat(2008)
    checkTahunKabisat(2011)

}

fun checkTahunKabisat(tahun: Int) {
    if (tahun % 4 == 0) {
        return println("Tahun $tahun adalah kabisat")
    } else {
        return println("Tahun $tahun bukan kabisat")
    }
}
