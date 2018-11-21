package akrupych.waha.data.weapons

import akrupych.waha.DicedNumber
import akrupych.waha.data.base.Ability
import akrupych.waha.data.base.Weapon
import akrupych.waha.data.base.WeaponType

class BoltPistol : Weapon() {
    override var name = "Bolt pistol"
    override var range = 12
    override var type: WeaponType = WeaponType.Pistol(DicedNumber(number = 1))
    override var strength = 4
    override var armorPenetration = 0
    override var damage = DicedNumber(number = 1)
    override var abilities = emptyList<Ability>()
}