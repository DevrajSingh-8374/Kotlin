fun main(){
   //Array 

       val numbers=arrayOf(1,2,3,4,6)
       numbers[4]=5//modification in array
       //println(numbers[0]) this is to print numbers with indexes
       for(x in numbers){
        println(x)
       }

       val st: Array<String> = arrayOf("Lovely", "Professional", "University")
       for (z in st) {
        println(z)
       }
     println("Creating Array using Lambda Expression")
       val arr=Array(5){i->i*i}
       for (y in arr) {
        println(y)
       }
    // 2D array of 3 by 3 matrix
    println("3 by 3 matrix")
       val num=arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9))

        for (z in num){
            for (y in z) {
                print(y)
                print(" ")
        }
        println()
    }


    
      
}


 
