fun main(args:Array<String>){
    //if
    val examResult = isPass(50)
    println("ExamResult:$examResult")

    val is3Contained = is3Contained(1..6)
    println("is3Contained:${is3Contained}")

    //when
    val myGrade = getGrade(95)
    println("My grade:$myGrade")
}

fun isPass(examScore:Int) : Boolean{
    if(examScore>=60){
        return true
    }else{
        return false
    }
}

fun is3Contained(intRange: IntRange) : Boolean{
    if(intRange.contains(3)){
        return true
    }else{
        return false
    }
}

fun getGrade(score : Int) : Char{
    when(score){
        in 90..100 -> return 'A'
        in 80..89 -> return 'B'
        in 70..79 -> return 'C'
        in 60..69 -> return 'D'
        else -> return 'F'
    }
}