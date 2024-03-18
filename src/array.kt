fun main(args: Array<String>) {
    var myarr= arrayOf("kiwi","mangoes",73,"M")
    myarr[1]="apples"
    println("i love eating ${myarr[1]}")
    var myarr2= arrayOf<Int>(5,7,43,79,-87,67,8,59,4)
    println(myarr2.sorted())

    val myarr3 = arrayOf<Float>(65.86f)
    println(myarr3.sorted())
    val myarr4 = arrayOf<String>("Malawi")
    println(myarr4.sorted())
}