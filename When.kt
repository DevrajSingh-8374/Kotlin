fun main() {
    var day=3
    var dayName=when(day){
        1->"Monday"
        2->"Tuesday"
        3->"Wednsday"
        4->"Thursday"
        5->"Friday"
        6->"Saturday"
        7->"Sunday"
        else->"Invalid Input"
    }
    println("Today is: $dayName")

//Even or Odd number using when
    val number=8
    when{
        number%2==0->println("$number is even")
        number%2!=0->println("$number is odd")
        else->"Invalid input"

    }
}