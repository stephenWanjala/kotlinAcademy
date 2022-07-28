/*You can declare variables at the top level. */
val PI = 3.14
var x = 0
var name="stephen"
val school:String="MySchool"  //string
val isMale=true //bolean


fun addOneToX(){
    x+=1
}
/*not familliar with functions? checkout to the `functions`  branch*/
fun main(args: Array<String>) {
    println("x = $x; PI = $PI")
addOneToX()
println("addOneToX()")
println("x = $x; PI = $PI")
}