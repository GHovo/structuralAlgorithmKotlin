package composite

interface MenuItem {
    fun setName(itemName: String)
    fun getPrice(): Double
    fun printItem()
}