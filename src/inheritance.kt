open class mzazi{
    var dad="Hello"
    var mum ="hey"
    var mumcolor ="light"
    var dadcolor ="dark"
}
class boy:mzazi(){
    fun bwoy(){
        println("He is $dadcolor and he say's $mum")
    }

}
class girl:mzazi(){
    fun mdem(){
        println("She is $mumcolor and she say's $dad")
    }
}

fun main(args: Array<String>) {
    val obj=boy()
    obj.bwoy()

    val obj1=girl()
    obj1.mdem()
}