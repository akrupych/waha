package akrupych.waha.data.models

import akrupych.waha.data.base.Model
import akrupych.waha.data.weapons.BoltPistol
import akrupych.waha.data.weapons.Boltgun
import akrupych.waha.data.weapons.FragGrenade
import akrupych.waha.data.weapons.KrakGrenade

class SpaceMarineSergeant : Model() {
    override var name = "Space Marine Sergeant"
    override var movement = 6
    override var weaponSkill = 3
    override var ballisticSkill = 3
    override var strength = 4
    override var toughness = 4
    override var wounds = 1
    override var attacks = 2
    override var leadership = 8
    override var save = 3
    override var weapons = listOf(BoltPistol(), Boltgun(), FragGrenade(), KrakGrenade())
}