package akrupych.waha.data.base

abstract class Model {
    abstract var name: String
    abstract var movement: Int
    abstract var weaponSkill: Int
    abstract var ballisticSkill: Int
    abstract var strength: Int
    abstract var toughness: Int
    abstract var wounds: Int
    abstract var attacks: Int
    abstract var leadership: Int
    abstract var save: Int
    abstract var weapons: List<Weapon>
}