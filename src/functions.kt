import kotlin.math.PI

fun main(args: Array<String>) {
println( birthdayGreetings("Alvin", 19,"Nairobi"))
    println(calculateAreaCircle(35.0))
}
fun birthdayGreetings(name: String,age: Int,location: String): String {
    val a = "Happy Birthday $name"
    val b = "You are $age years old"
    val c = "You are celebrated"
    val d = "This comes from $location"
    return "$a\n$b\n$c\n$d"
}

fun calculateArea(length: Double,width:Double):Double{
    return length * width

}

fun calculateAreaCircle(radius: Double):Double{
    return PI * radius * radius
}