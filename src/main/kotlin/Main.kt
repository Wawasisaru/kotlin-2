fun main(){
    greatPeople("Charlie")
     var x = reminder(5,40)
    println(x)
    addition(1,2,3,4)
    factAboutMyself("Nancy")
}

fun greatPeople(name: String){
    println("Hello"+ name)
}

fun reminder(num1:Int, num2:Int): Int{
    var vision = num1%num2
    return(vision)

}
fun addition(num1: Int,num2:Int,num3: Int,num4: Int){
    var sum=num1+num2+num3+num4
    println(sum)
}

fun factAboutMyself(name: String){
    println(name+"Am very crazy")
}
