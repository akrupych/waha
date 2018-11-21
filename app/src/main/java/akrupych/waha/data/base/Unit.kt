package akrupych.waha.data.base

abstract class Unit {

    abstract var name: String
    abstract var battlefieldRole: BattlefieldRole
    abstract var power: Int
    abstract var models: List<Model>
    abstract var abilities: List<Ability>
    abstract var factionKeywords: List<String>
    abstract var keywords: List<String>

    abstract fun getRequiredFields(): List<String>
    abstract fun setRequiredField(field: String, value: String)

    abstract fun getErrors(): List<String>

}