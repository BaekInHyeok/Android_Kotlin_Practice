fun main(args:Array<String>){

    val memo = Memo("Go to grocery","Buy milk, bread, and eggs",false)
    println(memo.toString())

    val memo2 = memo.copy("Go to home")
    println(memo2.toString())
}

data class Memo(val title:String, val content:String, val isDone:Boolean)