package bridg

class WoodHouse (override val color: Color) : House {
    override fun show() {
        print("The rock house color is ")
        color.getColor()
    }
}
