data class Dog(
val name: String,
val age: Int
)

fun main() {
val dog = Dog("Pluto", 7)
val (age, name) = dog
println(age) // Pluto
println(name) // 7
}