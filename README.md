# Kotlin Object-oriented concepts

Classes in Kotlin are declared using the keyword class

```kotlin
 class Person {

}
```

The class declaration consists of the class name, the class header (specifying its type parameters, the primary
constructor,
and some other things), and the class body surrounded by curly braces. Both the header and the body are optional; if the
class has no body, the curly braces can be omitted.
e.g.

```kotlin
class Person
```

## Constructors

A class in Kotlin can have a primary constructor and one or more secondary constructors. The primary constructor is a
part of
the class header, and it goes after the class name and optional type parameters.

```kotlin
class Person constructor(var firstName: String) {

}
```

If the primary constructor does not have any annotations or visibility modifiers,
the constructor keyword can be omitted

 ```kotlin
class Person(var firstName: String)
```

The primary constructor cannot contain any code. Initialization code can be placed in initializer blocks prefixed with
the init
keyword.
Primary constructor parameters can be used in the initializer blocks. They can also be used in property initializers
declared in
the class body:

```kotlin
class Student(val studentName: String, val studentId: Int) {
    init {
        val myNameUpperCase = studentName.uppercase()
    }
}

//Such declarations can also include default values of the class properties:
class Person(val firstName: String, val lastName: String, var isEmployed: Boolean = true)
```

You can use a trailing comma when you declare class properties:

```kotlin
class Person(
    val firstName: String,
    val lastName: String,
    var age: Int, // trailing comma
) { /*...*/ }
```
### Secondary constructors
A class can also declare secondary constructors, which are prefixed with constructor:
```kotlin

class Person(val pets: MutableList<Pet> = mutableListOf())
class Pet {
constructor(owner: Person) {
owner.pets.add(this) // adds this pet to the list of its owner's pets
}
}

```

If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor, either
directly or indirectly through another secondary constructor(s). Delegation to another constructor of the same class is done
using the this keyword:
```Kotlin
class Person(val name: String) {
val children: MutableList<Person> = mutableListOf()
constructor(name: String, parent: Person) : this(name) {
parent.children.add(this)
}
}
```

