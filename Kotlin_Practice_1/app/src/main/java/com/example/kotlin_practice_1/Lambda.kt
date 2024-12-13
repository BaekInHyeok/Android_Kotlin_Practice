import androidx.compose.runtime.internal.ComposableLambda

fun main(args:Array<String>){
    //람다식은? 값처럼 다룰 수 있는 익명함수
    val sayHello = fun() {
        println("Hello!")
    }
    sayHello()

    val squareNum : (Int) -> Int = {num -> num * num}
    println(squareNum(10))

    val squareNum2 = {num:Int -> num * num}
    println(squareNum2(20))

    val squareNum3 : (Int) -> Int = {it * it}
    println(squareNum3(30))

    fun invokeLambda(lambda:(Int)->Boolean):Boolean{
        return lambda(5)
    }

    val falseValue = invokeLambda({num->num==10})
    val trueValue = invokeLambda({num->num<10})

    //아래의 3개는 모두 동일
    invokeLambda({it<10})
    invokeLambda(){it<10}
    invokeLambda{it<10}

}