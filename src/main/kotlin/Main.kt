fun main(){
  numbers(arrayOf(34,56,9,20,34))
   fullName("Software")
    join()
    calculate(6,3)
//    statement("mary","Melisa")
}
//fun statement(name:String,name1:String):String {
//    var word1 = name
//    var word2 = name
//    if (word1 > name) {
//        return word1
//    } else if (word2 == name1) {
//        return word2
//    }



fun numbers(num:Array<Int>):Array<Int>{
    num.max()
    num.min()
    num.average()
    return num
}
fun fullName(name:String){
    println(name.split(""))
}
fun join(){
    var name= arrayOf("Mary","Tom","Ann")
    var  name1= arrayOf("Emma","Angel","Joan")

    println(name.plus("Emma").contentToString())


}
fun  calculate(num1:Int,num2:Int){
    var add=num1 +num2
    println(add)
    var subtr=num1 -num2
    println(subtr)
    var div=num1 *num2
    println(div)
    var multiply=num1 / num2
    println(multiply)

}
