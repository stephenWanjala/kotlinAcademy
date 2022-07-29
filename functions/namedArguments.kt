

/*
Named arguments
When calling a function, you can name one or more of its arguments. 
This can be helpful when a function has many
arguments and it's difficult to associate a value with an argument, 
especially if it's a boolean or null value.
When you use named arguments in a function call, you can freely change the order they are listed in, and if you want to use
 */

 

 fun formatName(firstName: String, lastName: String, title: String = "Mr.", delimiter: String = " ",) = "$title$delimiter$firstName$delimiter$lastName"

fun main(args: Array<String>) {
    // The order of the arguments doesn't matter
    //When calling this function, you don’t have to name all its arguments:
    println(formatName("Jane", "Smith", "Ms.", "."))
    //You can skip all the ones with default values:

    println(formatName("Jane", "Smith"))
    println(formatName("Jane", "Smith", "Ms."))
    println(formatName("Jane", "Smith", delimiter = "."))
    println(formatName("Jane", "Smith", title = "Ms."))

    /*  You are also able to skip specific arguments with default values, 
    rather than omitting them all. However, after the first skipped
    argument, you must name all subsequent arguments:*/


// You can pass a variable number of arguments ( vararg) with names using the spread operator:

fun getSumOfTheNumbers(vararg nums:Int):Int{
    var sum=0
    nums.forEach{
        sum+it
    }
    return sum
}

}
/*On the JVM: You can't use the named argument syntax when calling Java functions because Java bytecode does
not always preserve the names of function parameters. */
fun main(args: Array<String>) {
    println(getSumOfTheNumbers(nums = *arrayOf(1,2,3,4)))
}