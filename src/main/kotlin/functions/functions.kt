//*A function with two Int parameters and Int return type. */

fun addTwoNumbers(a:Int,b:Int):Int{
    return a+b
}
fun main(args: Array<String>) {
    
print("sum of 3 and 5 is ")
println(addTwoNumbers(3, 5))
/*A function body can be an expression. Its return type is inferred. */
fun addOtherTwoNumbers(a:Int,b:Int)=a+b
println("from without body->")
print("sum of 3 and 5 is ")
println(addOtherTwoNumbers(3, 5))

}