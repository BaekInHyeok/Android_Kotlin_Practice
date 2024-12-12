fun main(args:Array<String>){
    val korea = Korea("대한민국","서울","한국어")
    korea.singNationalAnthem()
}

open class Country(val fullName:String,val capital:String,val language:String){
    fun printFullName(){
        println("Full Name: $fullName")
    }
    fun printCapital() {
        println("Capital: $capital")
    }
    fun printLanguage() {
        println("Language: $language")
    }
    open fun singNationalAnthem(){
        println("Start singing")
    }
}

class Korea(fullName:String,capital:String,language:String):Country(fullName,capital,language){
    //메소드 오버라이딩
    override fun singNationalAnthem(){
        super.singNationalAnthem()//부모클래스의 메서드 실행
        println("Sing Korea national Anthem")
    }
}

class USA(val fullName:String,val capital:String,val language:String){
    fun printFullName(){
        println("Full Name: $fullName")
    }
    fun printCapital(){
        println("Capital: $capital")
    }
    fun printLanguage() {
        println("Language: $language")
    }

    fun singNationalAnthem(){
        println("Start singing")
        println("Sing USA national Anthem")
    }
}