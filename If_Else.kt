fun main(){
//Weather
    var temp=25
    if(temp>20){
        println("It's a warm day")
    }else{
        println("It's a cold day")
    }
//Age validating
    var age=17
    if(age>=18){
        println("Eligible for voting")
    }else(
        println("Not Eligible for voting")
    )
//Grading
       var score= 75
       print("Your grade is: ")
        if(score>=90){
            println("A")
        }else if(score>=85){
            println("B")
        }else if(score>=70){
            println("C")
        }else{
            println("D")
        }
//Calculator
    var a=10
    var b=5
    var ch='+'
    if(ch=='+'){
        println(a+b)
    }else if(ch=='-'){
        println(a-b)
    }else if(ch=='*'){
        println(a*b)
    }else if(ch=='/'){
        //Nested If else
        if(b!=0) {
            println(a / b)
        }else{
            println("Division by zero")
        }
    }else if(ch=='%'){
        println(a%b)
    }else{
        println("Not a valid operator")
    }


//Age Classification
    var aged=13
    if(aged<13){
        println("Child")
    }else if(aged in 13..19){    //Range
        println("Teenager")
    }else if(aged in 20..64) {
        println("Adult")
    }else{
        println("Senior")
    }
}