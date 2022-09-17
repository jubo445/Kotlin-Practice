//Class-1 Practice
/*open class Animal(val name: String){
    open fun makeSound(){
        println("$name Can make sound")
    }
}
class Dog(name: String) : Animal(name){
    override fun makeSound() {
        super.makeSound()
        println("$name Ghew GHew Kore")
    }
}

fun main(){
    val dog:Animal=Dog("Tommy")
    dog.makeSound()

}*/
//Class-2 Practice
//fun main(){
  /*  val names= listOf("Juabyer","Asad","Hero")

    for (name in names){
        println("My name is $name")
    }

 */
   /*var position :Int =0
    while (position<names.size){

        println("Name is : ${names[position]}")
        position++
    }


    for (i in 0..2){
        println("Name is : ${names[i]}")
    }*/

    //Class-3
    //mutable list
    /*val mUser:MutableList<String> = mutableListOf("Jubayer","Asad")
    val Users:List<String> = mUser

    Users.forEach {
        println("Name is : $it")
    }*/
    //mutable set
    // val mUser= mutableSetOf<String>("Jubayer","Asad","Jubayer","asad")


    //println("$mUser")
//MutableMap
   /* val cap:MutableMap<Int,String> = mutableMapOf(
        1 to "Jubayer",
        2 to "Asad",
        5 to "JB"
    )
    cap.forEach { (t, u) ->

        println("Name Is : ${cap[t]}")
    }
    //filter
    val numbers= listOf(10, -15, 20, -30, 40, -90, 50, -70)

    val pos=numbers.filter { num-> num>0}
    val neg=numbers.filter { num-> num<0}

    numbers.map {
        println(it)
    }
    println("Positive N : $pos")
    println("Negative N : $neg")

    val storedD=pos.sortedDescending()
    val sorted=pos.sorted()
    println(storedD)
    println(sorted)



}*/
/*class MyClass{
        fun addNum(): Int {
            return 5 + 2
        }
}
fun main(){
    val mc=MyClass()
    println("Result is : ${mc.addNum()}")
}*/
/*class Config(var server:String,var password:String)

fun main(){
    val conn=Config("101.111.112","jgayvUIG23")
    with(conn){
        println("Server Name is : $server")
        println("Password is : $password")
    }
}*/
