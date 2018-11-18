package akrupych.waha

class Unit {
    var name: String = ""
    var models: List<Model> = emptyList()

    override fun toString(): String {
        return "Unit(name='$name', models=$models)"
    }
}

class Model {
    var name: String = ""
    var movement: Int = 0
    var weaponSkill: Int = 0
    var ballisticSkill: Int = 0

    override fun toString(): String {
        return "Model(name='$name', movement=$movement, weaponSkill=$weaponSkill, ballisticSkill=$ballisticSkill)"
    }
}