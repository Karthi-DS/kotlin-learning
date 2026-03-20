package oops

open class Parent(name: String, age: Int) {
    init {
        println("init block")
    }

    var name = name
    var age = age

    fun printData(){
        println("you are ${name} and your age is ${age}")
    }
}

class Child(){
    val p = Parent("rahul",20)

    fun getParent(){
        p.printData()
    }
}

fun main(){
    val c = Child()
    c.getParent()
}