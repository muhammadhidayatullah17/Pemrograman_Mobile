fun main(){
    val otomotif = SatriaFU()
    otomotif.detail()
}

class SatriaFU {
    //Spesifikasi All New Satria F150
    val motorcycle: String = "All New Satria F150"
    val color: String = "Black"
    val power: Double = 13.6
    val tall: Int = 980
    val heavy: Int = 109
    val machine: Double = 147.33
    val price = 27_350_000

    fun detail(){
        println("==== THE SPECIFICATION OF MOTORCYCLE ====")
        println("Motorcycle's Name \"$motorcycle\"")
        println("The color is $color")
        println("Power   : $power kw")
        println("Tall    : $tall mm")
        println("Heavy   : $heavy kg")
        println("Machine : $machine cc")
        println("Price   : Rp$price")
    }
}
