package bridg

class RockHouse(override val color: Color) : House {
    override fun show() {
        print("The wood house color is ")
    color.getColor()
    }
}