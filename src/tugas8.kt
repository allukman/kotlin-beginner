fun main() {

    print("masukan nilai bahasa MTK: ")
    val mtk: Int = readLine()!!.toInt()
    print("masukan nilai bahasa Bahasa Indonesia: ")
    val bahasaIndonesia: Int = readLine()!!.toInt()
    print("masukan nilai bahasa Bahasa Inggris: ")
    val bahasaInggris: Int = readLine()!!.toInt()
    print("masukan nilai bahasa IPA: ")
    val ipa: Int = readLine()!!.toInt()

    val rataRata : Int = (mtk + bahasaIndonesia + bahasaInggris + ipa) / 4

    val grade = when (rataRata) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        in 0..59 -> 'E'
        else -> "input salah!"
    }


    println("$mtk, $bahasaIndonesia, $bahasaInggris, $ipa")
    println("Grade kamu adalah $grade")
    println("rata rata nilai ujian kamu adalah $rataRata")


}

