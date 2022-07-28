/*
    Parameters
Function parameters are defined using Pascal notation - name: type.
 Parameters are separated using commas, and each
    parameter must be explicitly typed:
 */

 fun getPowerOf(base: Int, exponent: Int): Int {
    var result = 1
    for (i in 1..exponent) {
        result *= base
    }
    return result
}

//or  fun getPowerOf(base: Int, exponent: Int) = base.pow(exponent)
fun main(args: Array<String>) {
    println(getPowerOf(2, 3))
}