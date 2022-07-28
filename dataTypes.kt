fun main(args: Array<String>) {
    val a: Int = 1 // immediate assignment
val b = 2
// `Int` type is inferred
val c: Int // Type required when no initializer is provided
c = 3
// deferred assignment
println("a = $a, b = $b, c = $c")
/*Read-only local variables are defined using the keyword val.
 They can be assigned a value only once.
 */

 /*
 Variables that can be reassigned use the var keyword. */

 var x = 23 // `Int` type is inferred by the compiler or explicity specify as var x:Int=23
x += 1
println("x = $x")



}