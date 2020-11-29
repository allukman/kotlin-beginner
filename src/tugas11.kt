fun main() {
    deteksiPalindrom("halo")
    deteksiPalindrom("malam")
    deteksiPalindrom("burung")
    deteksiPalindrom("kAtaK")
    deteksiPalindrom("ka")
// TAMBAHIN LOWERCASE
}

fun deteksiPalindrom(teks: String){
    val teksLower = teks.toLowerCase()
   if (teks.length <= 2){
       return println("kata harus lebih dari 2 huruf!!")
   } else {
       val kataPertama = teksLower
       var kataBaru = ""
       val i = teksLower.length - 1
       for (i in i downTo 0 ){
           kataBaru += teksLower[i]
       }
       if (kataPertama == kataBaru){
           return println("kata ini adalah palindrom")
       } else {
           return println("kata ini bukan palindrom!")
       }
   }
}