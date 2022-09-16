fun main() {
    val Dado = Dice(6)
    val resultadoTiro = Dado.roll()
    val luckyNumber = 6

    when (resultadoTiro) {
        luckyNumber -> println("Ganaste!")
        1 -> println("Que mal! Tu numero fue 1. Intentelo una vez mas")
        2 -> println("Lastima, Tu numero fue 2. Intentelo una vez mas")
        3 -> println("Mmmm termino medio, Tu numero fue 3. Intentelo una vez mas")
        4 -> println("Digamos que estuviste cerca! Tu numero fue 4. Intentelo una vez mas")
        5 -> println("Casiiii, pero no. Tu numero fue 5. Intentelo una vez mas")
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}