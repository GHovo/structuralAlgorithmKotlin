package bridg

fun main() {
    val yellowWoodHouse = WoodHouse(color = Yellow())
    yellowWoodHouse.show()
    val yellowRockHouse = RockHouse(color = Yellow())
    yellowRockHouse.show()
    val redWoodHouse = WoodHouse(color = Read())
    redWoodHouse.show()
    val redRockHouse = RockHouse(color = Read())
    redRockHouse.show()
}