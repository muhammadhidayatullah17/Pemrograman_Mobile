import java.util.*

fun main(args: Array<String>){
    val input = Scanner(System.`in`)

    print("Input bilangan = ")
    var a = input.nextInt()
    var multiples = a

    repeat(7) {
        a += multiples
        if (a % 2 == 0 || a % 3 == 0) {
            print("$a ")
        }
    }
}