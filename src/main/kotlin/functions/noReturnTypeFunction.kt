
/*A function that returns no meaningful value.----no return type 
unit(void equivalent in java) */
fun sayHigh(name:String):Unit{
    println("Hello $name")
}


/*
Unit return type can be omitted.
 */

 fun sayHighTwice(Greeting:String,name:String){
    println("$Greeting, $name")
}
fun main(args: Array<String>) {
    sayHigh("john")
    sayHighTwice("Hello myGuy","Kevin")
}