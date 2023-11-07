
class Chief(val barista: Barista) {
    fun brew() {
        barista.addSugar()
        barista.dilute()
        barista.addSweety()
    }
}