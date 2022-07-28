# kotlinAcademy
kotlin funcions
``kotlin
/* use fun keyword to declare functions*/
fun printName(name:String):Unit{
    println(name)
}

//unit return type can be ommitted
fun printName2(name:String){
    println(name)
}

//the type which can be inferred or single line ,the function can be an expression
fun sayHello(name:String)=println(name)
fun addMe(a:Int,b:Int)=a+b
``
