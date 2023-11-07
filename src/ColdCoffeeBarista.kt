
class ColdCoffeeBarista: Barista {
    override val coffeeName = "Cold coffee"
    private val coffee = Coffee(coffeeName)

    override fun dilute() {
        coffee.addSmth("Cream")
    }

    override fun addSugar() {
        coffee.addSmth("No Sugar")
    }

    override fun addSweety() {
        coffee.addSmth("Berries")
    }

    override fun returnCoffee(): Coffee {
        return coffee
    }
}