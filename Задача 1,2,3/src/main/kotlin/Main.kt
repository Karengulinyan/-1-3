fun main(args: Array<String>)
{
// Задача №1
    val amount = 1000
    val procentcommission = 0.0075
    val mincommission = 35

    var commission = amount * procentcommission
    if (commission < mincommission)
    {
        commission = mincommission.toDouble()
    }
    println("Комиссия за перевод = $commission рублей")

// Задача №2
    val likes = 33
    if (likes % 2 == 1 )
    {
        println("Понравилось $likes людям")
    }
    else
    {
        println("Тебя оценило $likes человек")
    }

// Задача №3
   val postpocupatel= true
    val totalprice= 5000.0

    var skidka= 0.0

    if (totalprice > 1000 && totalprice <= 10000)
    {
        skidka = 100.0
    }
    else if (totalprice > 10000)
    {
        skidka = totalprice * 0.05
    }

    if (postpocupatel)
    {
        skidka += totalprice * 0.01
    }

    val finalSum = totalprice - skidka
    println("Итоговая стоимость покупки состовляет: $finalSum")
}
