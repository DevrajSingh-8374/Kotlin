fun main(){

//First type
    for(i in 1..5){
        println(i)
    }
    println("-------------")
//Second Type
    for(i in 1 until 5){
        println(i)
    }
    println("-------------")
//Reverse
    for(i in 5 downTo 1){
        println(i)
    }
    println("-------------")
//Skip step
    for(i in 5 downTo 1 step 2){
        println(i)
    }
    println("-------------")
//Iteration on list
    val fruits=listOf("Apple","Banana","Cherry")

    for(fruit in fruits){
        println(fruit)
    }
    println("-------------")

//Third type
    for(fruit in fruits.indices){
        print(fruits[fruit])
        println(" $fruit")
    }
    println("-------------")
}


