fun main(args:Array<String>){
    val name="Joyce"

    //lateinit -> var
    lateinit var lunch:String
    //lunch="waffle"

    println(lunch)

    //lazy -> val
    val lazyBear : String by lazy{
        println("Bear is coming")
        "Brown Bear"
    }

    println("First try : : :")
    println(lazyBear)
    println("Secont try : : :")
    println(lazyBear)

}