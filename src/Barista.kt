
interface Barista {
    val coffeeName: String

    fun dilute()
    fun addSweety()
    fun addSugar()
    fun returnCoffee(): Coffee
}