//함수
fun main(args:Array<String>){
    printStudentInfo("Joyce",15)
    printStudentInfo("Karl",12)
    printStudentInfo("Ace",20)

    print(addNumber(100,2000))
}

//반환값이 없는 함수
fun printStudentInfo(name:String, age:Int):Unit{
    println("Student Name: "+name)
    println("Student Name: $name")
    println("Student Age: $age")
    println("Student Age: "+age)
}
//반환값이 있는 함수
fun addNumber(n1:Int, n2:Int):Int{
 return n1+n2
}

