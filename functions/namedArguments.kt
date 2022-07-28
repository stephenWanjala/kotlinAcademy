

/*
Named arguments
When calling a function, you can name one or more of its arguments. 
This can be helpful when a function has many
arguments and it's difficult to associate a value with an argument, 
especially if it's a boolean or null value.
When you use named arguments in a function call, you can freely change the order they are listed in, and if you want to use
 */

 

 fun formatName(firstName: String, lastName: String, title: String = "Mr.", delimiter: String = " ") = "$title$delimiter$firstName$delimiter$lastName"

fun main(args: Array<String>) {
    println(formatName("Jane", "Smith", "Ms.", "."))
    println(formatName("Jane", "Smith"))
    println(formatName("Jane", "Smith", "Ms."))
    println(formatName("Jane", "Smith", delimiter = "."))
    println(formatName("Jane", "Smith", title = "Ms."))
}