fun main() {
    var a = 10
    var b = 5
    var add = a + b
//Arithmetic Operators
    println("Addition of $a and $b = $add")
    println("Multiplication of $a and $b = ${a*b}")
    println("Subtraction of $a and $b = ${a-b}")
    println("Modulus of $a and $b = ${a%b}")
    println("Division of $a and $b = ${a/b}")
//Relational Operators
    println("Is a greater than b = ${a>b}")
    println("Is a less than b = ${a<b}")
    println("Is a greater than equals to b = ${a>=b}")
    println("Is a less than equals to b = ${a<=b}")
    println("Is a equals to b = ${a==b}")
    println("Is a not equals to b = ${a!=b}")
//Assignment Operators
    a+=b
    println(a)
    a-=b
    println(a)
    a*=b
    println(a)
    a/= b
    println(a)
//Unary Operators
    println(+a)
    println(-a)
    println(++a)
    println(--a)
    println(!true)
//Logical Operators
    println((a>b)&&(true))//Only when both are true
    println((b>a)||(false))//Any one should true
    println(!false)//Inverts the statement
//Bitwise Operator
    println("a.shl(b): "+a.shl(b))
    println("a.shr(b): "+a.shr(b))
    println("a.ushr(b:) "+a.ushr(b))
    println("a.and(b): "+a.and(b))
    println("a.or(b): "+a.or(b))
    println("a.xor(b): "+a.xor(b))
    println("a.inv(): "+a.inv())

}
