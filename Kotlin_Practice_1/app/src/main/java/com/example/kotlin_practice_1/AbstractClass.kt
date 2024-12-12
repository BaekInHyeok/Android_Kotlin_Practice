fun main(args:Array<String>){

    val overwatch = Overwatch()
    overwatch.startGame()
    overwatch.printGameName()
}

abstract class Game{
    fun startGame(){
        println("Start Game")
    }

    abstract fun printGameName()
}

class Overwatch : Game(){
    override  fun printGameName(){
        println("This is Overwatch")
    }
}