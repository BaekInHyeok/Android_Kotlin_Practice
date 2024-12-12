fun main(args:Array<String>){
    val car=Car("Volvo","Red",13)
    val car2=Car("Hyundai","Yellow",20)
    val car3=Car("Ford","Blue")
}

class Car(val name:String, val color:String, val age:Int){
    init{
        println("Car $name has $color color and $age years old")
    }
    constructor(name:String,color:String) : this(name,color,10){
        println("Car $name has $color color and $age years old")
    }
}