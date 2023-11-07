
class CappuccinoBarista: Barista {
    override val coffeeName = "Cappuccino"
    private val coffee = Coffee(coffeeName)

    override fun dilute() {
        coffee.addSmth("Cream")
    }

    override fun addSugar() {
        coffee.addSmth("Sugar")
    }

    override fun addSweety() {
        coffee.addSmth("Cinnamon")
    }

    override fun returnCoffee(): Coffee {
        return coffee
    }
}