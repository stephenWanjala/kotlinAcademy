package ktClasses

/*
Classes in Kotlin are declared using the keyword class->class Person{}

The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor,
and some other things), and the class body surrounded by curly braces. Both the header and the body are optional; if the
class has no body, the curly braces can be omitted.
e.g
class Person
 */
/*
Constructors
A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is a part of
the class header, and it goes after the class name and optional type parameters.
 */
class  Person constructor(var firstName:String){

}

