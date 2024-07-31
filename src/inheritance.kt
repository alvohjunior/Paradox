fun main(args: Array<String>) {
    val mathTeacher1 = MathTeacher("Felix", 34)
    println(mathTeacher1.teacherMath())
    val scienceTeacher1 = ScienceTeacher("Elizabeth", 30)
    println(scienceTeacher1.teacherScience())
    val englishTeacher1 = EnglishTeacher("Patrick", 39)
    println(englishTeacher1.teacherEnglish())
    val geographyTeacher1 = GeographyTeacher("Ngatia", 24)
    println(geographyTeacher1.teacherGeography())
}
open class Teacher(var name: String, age: Int){
    init {
        println("My name is $name")
        println("I am $age years old")
    }
}
class MathTeacher(name: String,age: Int):Teacher(name , age){
fun teacherMath(){
    println("I teach Mathematics")
}
}
class ScienceTeacher(name: String,age: Int):Teacher(name , age){
    fun teacherScience(){
        println("I teach Science")
    }
}
class EnglishTeacher(name: String,age: Int):Teacher(name , age){
    fun teacherEnglish(){
        println("I teach English")
    }
}
class GeographyTeacher(name: String,age: Int):Teacher(name , age){
    fun teacherGeography(){
        println("I teach Geography")
    }
}

