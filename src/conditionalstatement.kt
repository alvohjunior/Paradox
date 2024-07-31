fun main(args: Array<String>) {
    val age = 12

    if (age > 18) {
        println("You are $age and so you can vote")
    } else {
        println("You are $age and so you are not allowed to vote")
    }

    val number = 4
    if (number == 1) {
        println("You lost the guess")
    } else if (number == 2) {
        println("You almost got it right")
    } else if (number == 3) {
        println("Congratulations you got it right")
    } else {
        println("$number is not walid")
    }

//WHEN STATEMENT
val namba = 6
    when(namba){
        1 -> println("You lost the guess")
        2 -> println("You almost got it right")
        3 -> println("Congratulations you got it right")
        else -> println("$namba is not valid,please key " + "in a number between 1 and 3  ")
    }

    var myArray = arrayOf("Opera","Chrome","Firefox","Safari","Brave")
    for (browser in myArray) {
        println(browser)
    }
    val num = 4
    while (num<=10){
        println("LOOP: $num")

    }
}
