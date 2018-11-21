package akrupych.waha.data.models

import akrupych.waha.data.base.Model
import akrupych.waha.data.weapons.BoltPistol
import akrupych.waha.data.weapons.Boltgun
import akrupych.waha.data.weapons.FragGrenade
import akrupych.waha.data.weapons.KrakGrenade

class SpaceMarine : Model() {
    override var name = "Space Marine"
    override var movement = 6
    override var weaponSkill = 3
    override var ballisticSkill = 3
    override var strength = 4
    override var toughness = 4
    override var wounds = 1
    override var attacks = 1
    override var leadership = 7
    override var save = 3
    override var weapons = listOf(BoltPistol(), Boltgun(), FragGrenade(), KrakGrenade())
}