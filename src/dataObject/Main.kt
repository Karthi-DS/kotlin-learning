package dataObject

class Main {
    var name:String?=null
    var token:String?=null
    constructor(name:String, token:String) {
        this.name = name
        this.token = token

        var user = User(1, name, token)
        SessionManager.saveUser(user)

        println("Token is ${SessionManager.getToken()}")
    }
}

fun main(){
    val m = Main("karthi","token1")
}