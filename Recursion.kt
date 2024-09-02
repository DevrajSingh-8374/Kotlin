fun factorial(a: Int):Int{
    if(a<=0){
        return 1
    }
    return a*factorial(a-1)
}

fun main(){
    print("Enter the Number: ")
    val num= readln().toInt()
    val fact=factorial(num)
    println(fact)
}