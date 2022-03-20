import java.util.Scanner
val input = Scanner(System.`in`)

fun main (args: Array<String>){
    print("Nilai x = ")
    val x = input.nextInt()
    val rumus = (2 * (x * x) + (5 * x)) - 8
    print(rumus)
}