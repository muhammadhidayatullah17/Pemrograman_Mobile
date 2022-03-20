import java.util.Scanner;

fun main(args: Array<String>){
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //mengambil input
    print("Waktu Sekarang: ")
    val waktu = input.nextLine()
    print("Nama Anda: ")
    val nama = input.nextLine()
    print("Umur Anda: ")
    val umur = input.nextLine()
    print("Suhu Tubuh Anda: ")
    val suhu = input.nextFloat()

    //menampilkan output
    println("Selamat Pagi, $nama")
    println("Umur anda $umur Tahun")
    println("Suhu Tubuh anda $suhu derajat Celcius")
}
