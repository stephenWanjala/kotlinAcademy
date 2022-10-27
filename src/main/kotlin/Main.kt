fun main(args: Array<String>) {



}

/*
Unit-returning functions
If a function does not return a useful value,
 its return type is Unit. Unit is a type with only one value - Unit. This value does not
have to be returned explicitly:

 */

fun printMyName(name:String):Unit{
    if(name!=null){
        println("Name:$name")
    }
}

/*
the same can be written as
fun printMyName(name:String){
    if(name!=null){
        println("Name:$name")
    }
}
 */