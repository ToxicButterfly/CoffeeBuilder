
class ClassicBarista() : Barista {
    override val coffeeName = "Espresso"
    private val coffee = Coffee(coffeeName)

    override fun dilute() {
        coffee.addSmth("Milk")
    }

    override fun addSugar() {
        coffee.addSmth("Sugar")
    }

    override fun addSweety() {
        coffee.addSmth("Caramel syrup")
    }

    override fun returnCoffee(): Coffee {
        return coffee
    }
}