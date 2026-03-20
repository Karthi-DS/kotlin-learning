package oops


open class Parent1 {
    val name: String
    var age:Int

    init {
        println("Object created...")
    }

    constructor(name: String, age:Int) {
        this.name = name
        this.age = age
    }

    open fun printDetails(){
        println("will be overriden")
    }
}

class SubClass(name: String,age: Int): Parent1(name,age){
    override fun printDetails(){
        println("your name is ${name} and your age is ${age}")
    }
}

fun main(){
    val s = SubClass("karthi",20)
    s.printDetails()
}