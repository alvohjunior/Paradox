fun main(args: Array<String>) {
    val obj1 = Person("Alvin", "Male", 44 )
    println(obj1.name)
    println(obj1.gender)
    println(obj1.age)
    obj1.canVote()


//    instances of class bulb
val bulb1 = Bulb()
    bulb1.turnOn()
    println(bulb1.displayBulbstatus())
    bulb1.turnOff()
    println(bulb1.displayBulbstatus())

    val bulb2 = Bulb()
    bulb2.turnOn()
    println(bulb2.displayBulbstatus())
    bulb2.turnOff()
    println(bulb2.displayBulbstatus())
}
class Person(var name: String, var gender: String, var age: Int){
    fun canVote(){
        if(age>18){
            println("You can vote")
        }else{
            println("You can not vote")
        }
    }
}

class Bulb(){
    var isOn: Boolean=false
    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }
    fun displayBulbstatus(){
        if(isOn==true){
            println("Bulb is on")
        }else{
            println("Bulb is off")
        }
    }
}

class Animal(var name: String, color: String){
    

}
