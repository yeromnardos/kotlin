class staff(val name:String,val age:Int,val gender:String){

}

fun main(args: Array<String>) {
    val myobj=staff("Kiya",65,"Female")
    println("my name is ${myobj.name} and I am ${myobj.age} years old and i am a ${myobj.gender}")
    val myobj1=staff("Kiya",65,"Female")
    println("my name is ${myobj.name} and I am ${myobj.age} years old and i am a ${myobj.gender}")
    val myobj2=staff("joy",12,"Female")
    println("my name is ${myobj1.name} and I am ${myobj1.age} years old and i am a ${myobj1.gender}")
    val myobj3=staff("john",22,"male")
    println("my name is ${myobj2.name} and I am ${myobj2.age} years old and i am a ${myobj2.gender}")
    val myobj4=staff("Noa",24,"male")
    println("my name is ${myobj3.name} and I am ${myobj3.age} years old and i am a ${myobj3.gender}")
}



