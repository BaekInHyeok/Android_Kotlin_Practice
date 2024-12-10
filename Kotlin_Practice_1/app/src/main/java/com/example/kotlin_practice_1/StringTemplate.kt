fun main(args:Array<String>){
    //String Template
    val price=1000
    val tax=100

    val originalPrice = "The original price is $price"
    val realPrice = "The real price is ${price-tax}"

    println(originalPrice)
    println(realPrice)
}