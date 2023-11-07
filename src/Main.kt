fun main() {
    val classicBarista = ClassicBarista()
    val cappuccinoBarista = CappuccinoBarista()
    var coldCoffeeBarista = ColdCoffeeBarista()
    var chief = Chief(classicBarista)
    chief.brew()
    println(classicBarista.returnCoffee())
    chief = Chief(cappuccinoBarista)
    chief.brew()
    println(cappuccinoBarista.returnCoffee())
    chief = Chief(coldCoffeeBarista)
    chief.brew()
    println(coldCoffeeBarista.returnCoffee())
}
