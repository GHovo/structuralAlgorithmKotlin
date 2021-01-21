package composite

fun main() {
    val menuItems = mutableListOf<MenuItem>()

    val burger = Meal(100.0).apply { setName("Burger") }
    val fries = Meal(50.0).apply { setName("Fries") }
    val pizza = Meal(200.0).apply { setName("Pizza") }
    val burgerCombo = CompoMeal().apply { setName("Burger combo meal") }
    val awesomeCombo = CompoMeal().apply { setName("Awesome combo meal") }

    burgerCombo.apply {
        addItem(burger)
        addItem(fries)
    }

    awesomeCombo.apply {
        addItem(burgerCombo)
        addItem(pizza)
    }

    menuItems.addAll(listOf(burger, pizza, burgerCombo, awesomeCombo))

    menuItems.forEach {
        it.printItem()
    }
}