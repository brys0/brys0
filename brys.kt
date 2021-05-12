import java.lang.StringBuilder

fun main() {
    val brys = User(name = "Brys", age = 17, occupation = "Developer", nerd = true)
    val user = StringBuilder()
    user.append("Name: ${brys.name}\n")
    user.append("Age: ${brys.age}\n")
    user.append("Occupation: ${brys.occupation}\n")
    user.append("Nerd: ${brys.nerd}")
    println(user)
}
data class User(val name: String, val age: Int, val occupation: String, val nerd: Boolean)
