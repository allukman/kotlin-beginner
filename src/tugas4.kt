import java.util.*

fun main() {

    println(checkAge(2002))
    println(checkAge(1990))

}

fun checkAge(tahunLahir: Int) :Int {

    val cal = Calendar.getInstance()
    val thisYear = cal.get(Calendar.YEAR)
    val umur = thisYear - tahunLahir
    return umur
}