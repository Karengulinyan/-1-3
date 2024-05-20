//Задача №1
fun main(args: Array<String>)
{
   val seconds = 40 * 60
    println(agoToText(seconds))
}

fun agoToText(seconds: Int): String {
    return when
    {
        seconds in 0..60 -> "был(а) только что"
        seconds in 61..60 * 60 -> "${minutesAgo(seconds)} назад"
        seconds in 60 * 60 + 1..24 * 60 * 60 -> "${hoursAgo(seconds)} назад"
        seconds in 24 * 60 * 60 + 1..48 * 60 * 60 -> "вчера"
        seconds in 48 * 60 * 60 + 1..72 * 60 * 60 -> "позавчера"
        else -> "давно"
    }
}

fun minutesAgo(seconds: Int): String {
    val minutes = seconds / 60
    return when
    {
        minutes % 10 == 1 && minutes != 11 -> "Был в сети $minutes минуту"
        minutes % 10 in 2..4 && (minutes % 100 < 10 || minutes % 100 > 20) -> "Был в сети $minutes минуты"
        else -> "Был в сети $minutes минут"
    }
}

fun hoursAgo(seconds: Int): String {
    val hours = seconds / (60 * 60)
    return when
    {
        hours % 10 == 1 && hours != 11 -> "Был в сети $hours час"
        hours % 10 in 2..4 && (hours % 100 < 10 || hours % 100 > 20) -> "Был в сети $hours часа"
        else -> "Был в сети $hours часов"
    }

}
//Задча №2
fun main(args: Array<String>) {
    println("Введите способ оплаты: " +
            "1 - MasterCard " +
            "2 - Maestro " +
            "3 - Мир/Visa " +
            "4 - VK Pay ")
    val oplata: Int = readLine()?.toInt()?: 0
    println("Введите сумму перевода: ")
    val amount: Double = readLine()?.toDouble()?: 0.0
    if (oplata == 1 || oplata == 2){
        if (amount >= 300 && amount <=75000){
            print("Сумма перевода: " + amount)
        }else{
            val proc = 0.6
            val sum = amount * proc / 100
            val eksum = amount + sum + 20
            println("Сумма перевода: " + eksum)
        }
    }else if (oplata == 3){
        if (amount >= 35){
            val proc = 0.75
            val sum = amount * proc / 100
            val oksum = amount + sum
            println("Сумма перевода: " + oksum)
        }else{
            println("Сумма перевода должна быть минимум 35 рублей")
        }
    }else if (oplata == 4){
        print("Сумма перевода: " + amount)
    }

}


