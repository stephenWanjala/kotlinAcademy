/*You can declare variables at the top level. */
val PI = 3.14
var x = 0

fun addOneToX(){
    x+=1
}
/*not famillia with functions? checkout to the `functions`  branch*/
fun main(args: Array<String>) {
    println("x = $x; PI = $PI")
addOneToX()
println("addOneToX()")
println("x = $x; PI = $PI")
}