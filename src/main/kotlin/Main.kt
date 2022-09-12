import java.net.URL
import java.util.*

fun getSt(): String? {
    return null
}


fun main(args: Array<String>) {
    var aa:Int
    val ins:Scanner = Scanner(System.`in`); aa = ins.nextInt()

    val str = Scanner(System.`in`)
    val bbb = str.nextDouble()

    main3()
    var b: String? = "abc900";
    b = null
   // val l: Int = if (b != null) b.length else -1

    // elvis оператор
    println(b?.length ?: -1)


    var a1: String = "123"

    var a6: Byte = 12 // 8
    var a0: Short = 11; // 16
    var a2: Int = 123 // 32
    var a3: Long = 123 // 64

    var a4: Double = 1.45
    var a5: Float = 1.45F

    var b1: Long = a2.toLong()
    var c1: Char = 'A'
    var flag: Boolean = true

    val javaUser =  JavaUser("test@test.com");
    println(javaUser.email)

    val kotlinUser = KotlinUser("kotlin@test.com")
    println(kotlinUser.email)
    kotlinUser.email = "new@test.com"

    println("Hello World!")
    println(sqr(6))
    println(sqr(5.7))
    var age = 89
    age = 5.6.toInt()
    print(age)
    var dd = 7.8
    dd = 5.toDouble()
    println()
    var y = readLine()?.toInt()
    y = y!! + 1

//    println(y)


  //  val l = b!!.length

    val address = "https://ya.ru"
    val someText = URL(address).readText()


    val cats = arrayListOf("Васька")
    cats.add("Барсик")
    println(cats::class)




}
fun sqr(x: Int) = x * x
fun sqr(x: Double) = x + x

fun myFirstFunc(a: Long): Int {
    return a.toInt()
}
fun myFirstFunc2() {

}

fun main2() {
    var rand = Random()
    val intAr = IntArray(10, {rand.nextInt(300)})
    var sum = 0
    for (i in intAr){
        print(i.toString()+", ")
        if (i % 2 == 0)
            sum += i
    }
    println(sum)
}

fun main3() {
    val intAr2 = arrayOf(2,4,5,6);
    println(intAr2.size)
}