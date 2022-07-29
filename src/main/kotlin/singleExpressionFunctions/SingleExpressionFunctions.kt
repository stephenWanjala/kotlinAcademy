package singleExpressionFunctions

/*
Single-expression functions
When a function returns a single expression,
 the curly braces can be omitted and the body is specified after a = symbol:
 */

fun doubleTheNumber(num:Int):Int=num*2

/*
Explicitly declaring the return type is optional
 when this can be inferred by the compiler:
 as below
 fun doubleTheNumber(num:Int)=num*2
 */

fun main() {
    println(doubleTheNumber(20))
}