fun main(args:Array<String>){
    //Range Class
    //IntRange, LongRange, CharRange
    val numRange : IntRange = 1..5

    println(numRange.contains(3))
    println(numRange.contains(10))

    val charRange : CharRange = 'a'..'e'
    println(charRange.contains('z'))
    println(charRange.contains('b'))

    //1.For
    for(i in 1..5){
        print(i)
    }

    for(i in 1 until 10){
        print(i)
    }

    for(i in 10 downTo 1){
        print(i)
    }

    for(i in 1..10 step 2){
        print(i)
    }

    //2.While
    var num=1
    while (num<5){
        println("current number : $num")
        num++;
    }

    var num2 = 6
    do{
        println("current number : $num2")
        num++;
    }while(num<5)

}