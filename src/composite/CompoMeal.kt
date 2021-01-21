package composite

class CompoMeal : MenuItem {
    private var mealName = ""
    private val items = mutableListOf<MenuItem>()

    fun addItem(menuItem: MenuItem) {
        items.add(menuItem)
    }

    fun removeItem(menuItem: MenuItem) {
        items.remove(menuItem)
    }

    override fun setName(itemName: String) {
        mealName = itemName
    }

    override fun getPrice(): Double {
        var total = 0.0
        items.forEach {
            total += it.getPrice()
        }
        return total
    }

    override fun printItem() {
        println("$mealName - ${getPrice()}")
    }
}