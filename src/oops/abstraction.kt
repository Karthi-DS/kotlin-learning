package oops

abstract class Shape {
    abstract fun area():Double;

    fun display() {
        println("Calculating area...")
    }
}

class Circle(val radius: Double) : Shape() {

    override fun area(): Double {
        return 3.14 * radius * radius
    }
}

fun main()
{
    val c = Circle(2.1)
    println("area is ${c.area()}")
}