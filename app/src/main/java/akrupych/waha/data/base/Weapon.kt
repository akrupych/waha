package akrupych.waha.data.base

import akrupych.waha.DicedNumber

abstract class Weapon {
    abstract var name: String
    abstract var range: Int
    abstract var type: WeaponType
    abstract var strength: Int
    abstract var armorPenetration: Int
    abstract var damage: DicedNumber
    abstract var abilities: List<Ability>
}