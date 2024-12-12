fun main(args:Array<String>){
    //1. List
    //Immutable List
    val fruitList = listOf("Banna","Apple","Cherry") //값을 바꾸지 못함
    println(fruitList)

    //mutable List
    val mutableList = mutableListOf("Banna","Apple","Cherry")
    println("First fruit: ${mutableList[0]}")
    mutableList[0]="Strawberry"//값을 바꿀 수 있음
    println(mutableList)

    mutableList.forEach{
        fruit -> println("my fruit is $fruit")
    }

    //2. Set : 순서없음, 중복 안됨
    //Immutable Set : 변경불가
    val immutableSet = setOf(1,1,2,2,3,3,3,4)
    println(immutableSet)

    //mutable Set : 요소 변경 가능
    val mutableSet = mutableSetOf(1,1,2,2,3,3,3,4)
    println(mutableSet)
    mutableSet.add(100)
    println(mutableSet)
    mutableSet.remove(1)
    println(mutableSet)
    println(mutableSet.contains(3))//포함여부 확인

    //3. Map : 키와 값의 쌍
    //immutableMap
    val immutableMap = mapOf("name" to "Joyce","age" to 100, "height" to 170)
    println(immutableMap["name"])

    //mutableMap
    val mutableMap = mutableMapOf("name" to "Joyce","age" to 100, "height" to 170)
    println(mutableMap["age"])
    mutableMap["age"]=10
    println(mutableMap["age"])

    mutableMap.put("hobby","coding")
    mutableMap.remove("name")
    mutableMap.replace("age",80)
    println(mutableMap)
}