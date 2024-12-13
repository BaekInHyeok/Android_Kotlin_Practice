fun main(args:Array<String>){
    println(MyFirstObject.number)
    MyFirstObject.sayHello()

    println(Dinner.MENU)
    println(Dinner.MyCompanionObject.MENU)
    Dinner.eatDinner()
}

//singleton 패턴
object MyFirstObject{
    val number=1
    fun sayHello(){
        println("Hello")

    }
}

//companion object
class Dinner{
    val lunch="steak"
    companion object MyCompanionObject{
        val MENU = "pasta"
        fun eatDinner(){
            println("Today's menu is $MENU")
        }
    }
}