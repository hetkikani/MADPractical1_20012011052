

fun sum(){
    var num1 =100
    var num2 = 200
    var num3 = -20
    println("Addition of $num1 , $num2,$num3 is "+(num1+num2+num3))
}
fun sub(){
    var num1 =100
    var num2 = 200
    var num3 = -20
    println("Subtraction of $num1 , $num2,$num3 is "+(num1-num2-num3))
}

fun mul(){
    var num1 =100
    var num2 = 200
    var num3 = -20
    println("Multiplication of $num1 , $num2,$num3 is "+(num1*num2*num3))
}

fun div(){
    var num1 =200
    var num2 = 100
    println("Division of $num1 , $num2 is "+(num1/num2))
}
fun main(args: Array<String>){
    sum()
    sub()
    mul()
    div()
}