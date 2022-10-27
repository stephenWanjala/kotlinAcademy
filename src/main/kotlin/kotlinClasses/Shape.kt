package kotlinClasses


/*
Creating classes and instances
To define a class, use the class keyword.
 */
class Shape
/*
Properties of a class can be listed in its declaration or body.
 */

class Circle(var raduis:Int){
    val perimeter=2*Math.PI*raduis
}
/*
The default constructor with parameters listed in
the class declaration is available automatically.
 */

fun main() {
    val circle=Circle(12)
    println("The perimeter of the circle is ${circle.perimeter}")
}