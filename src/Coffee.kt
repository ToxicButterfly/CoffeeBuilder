
class Coffee(val coffeeName: String) {
    private var ingredients = mutableListOf<String>()

    fun addSmth(ingr: String){
        ingredients.add(ingr)

    }

    override fun toString(): String {
        return "Coffee(coffeeName='$coffeeName', ingredients=$ingredients)"
    }

}