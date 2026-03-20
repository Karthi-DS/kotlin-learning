package dataObject

object SessionManager {
    private var user:User? = null

    fun saveUser(user: User){
        this.user = user
    }

    fun getToken():String?{
        return this.user?.token
    }
}