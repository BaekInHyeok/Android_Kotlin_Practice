fun main(args:Array<String>){

    val car = Car2()

    car.drive()
    car.stop()
    car.destroy()

    val bike = Bike()
    bike.drive()
    bike.stop()
    bike.destroy()
}

//인터페이스
interface Vehicle{
    fun drive()
    fun stop()
    fun destroy(){
        println("Vehicle is destroyed")
    }
}

class Car2 : Vehicle{
    override fun drive() {
        println("Car2 is moving")
    }

    override fun stop() {
        println("Car2 is stopping")
    }

    override fun destroy() {
        super.destroy()
        println("The vehicle is Car2")
    }
}

class Bike : Vehicle{
    override fun drive() {
        println("Bike is moving")
    }
    override fun stop() {
        println("Bike is stopping")
    }

}