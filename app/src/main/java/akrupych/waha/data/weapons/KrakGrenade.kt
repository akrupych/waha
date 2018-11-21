package akrupych.waha.data.weapons

import akrupych.waha.DicedNumber
import akrupych.waha.data.base.Ability
import akrupych.waha.data.base.Weapon
import akrupych.waha.data.base.WeaponType

class KrakGrenade : Weapon() {
    override var name = "Krak grenade"
    override var range = 6
    override var type: WeaponType = WeaponType.Grenage(DicedNumber(number = 1))
    override var strength = 6
    override var armorPenetration = -1
    override var damage = DicedNumber(dice = 3)
    override var abilities = emptyList<Ability>()
}