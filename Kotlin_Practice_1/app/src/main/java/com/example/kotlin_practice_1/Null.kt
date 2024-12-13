fun main(args:Array<String>){
    //Nullable vs Non-Nullable(Default)
    var myName : String = "Joyce"
    println(myName.reversed())

    //Nullable?
    var nullabeMyname : String? = "Joyce"
    //println(nullabeMyname.reversed()) //null일 수도 있기 때문에 거꾸로 출력 불가
    println(nullabeMyname?.reversed())

    // ?:
    val joyce = nullabeMyname?.reversed() ?: "Anonymous"
    println("joyce: $joyce")

    //확정연산자
    // !!
    println(nullabeMyname!!.reversed())
}