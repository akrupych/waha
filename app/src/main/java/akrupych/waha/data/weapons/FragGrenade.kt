package akrupych.waha.data.weapons

import akrupych.waha.DicedNumber
import akrupych.waha.data.base.Ability
import akrupych.waha.data.base.Weapon
import akrupych.waha.data.base.WeaponType

class FragGrenade : Weapon() {
    override var name = "Frag grenade"
    override var range = 6
    override var type: WeaponType = WeaponType.Grenage(DicedNumber(dice = 6))
    override var strength = 3
    override var armorPenetration = 0
    override var damage = DicedNumber(number = 1)
    override var abilities = emptyList<Ability>()
}