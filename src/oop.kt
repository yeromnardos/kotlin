class saf{

    //    data num
    var num:Int=9

    //    member function
    fun square():Int{
        return num*num
    }

}

fun main(args: Array<String>) {
//    instance of my obj
    var myobj=saf()
    println(myobj.square())
}


