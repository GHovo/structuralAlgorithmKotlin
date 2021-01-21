package composite

class Meal (val mealPrice: Double) : MenuItem {
    var mealName: String = ""

    override fun setName(itemName: String) {
        mealName = itemName
    }

    override fun getPrice(): Double {
        return mealPrice
    }

    override fun printItem() {
        println("$mealName - $mealPrice")
    }
}