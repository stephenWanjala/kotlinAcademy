

/*
Default arguments
Function parameters can have default values,
 which are used when you skip the corresponding argument. 
 This reduces the number of overloads:
 */

 /*
 In Kotlin, you can provide default values to parameters in function definition.

If the function is called with arguments passed, those arguments are used as parameters.
 However, if the function is called without passing argument(s), 
default arguments are used.
  */

    fun divide(a: Int, b: Int = 1) = a / b

    fun main(args: Array<String>) {
        println(divide(10, 2))
        println(divide(10))
    }


