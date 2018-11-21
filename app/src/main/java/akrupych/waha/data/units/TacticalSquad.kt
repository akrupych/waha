package akrupych.waha.data.units

import akrupych.waha.data.abilities.AndTheyShallKnowNoFear
import akrupych.waha.data.abilities.CombatSquads
import akrupych.waha.data.base.BattlefieldRole
import akrupych.waha.data.base.Unit
import akrupych.waha.data.models.SpaceMarine
import akrupych.waha.data.models.SpaceMarineSergeant
import akrupych.waha.listOf

class TacticalSquad : Unit() {

    override var name = "Tactical Squad"
    override var battlefieldRole = BattlefieldRole.Troops
    override var power = 5
    override var models = listOf(4, SpaceMarine()).plus(SpaceMarineSergeant())
    override var abilities = listOf(AndTheyShallKnowNoFear(), CombatSquads())
    override var factionKeywords = listOf("IMPERIUM", "ADEPTUS ASTARTES")
    override var keywords = listOf("INFANTRY", "TACTICAL SQUAD")

    var chapter: String? = null

    override fun getRequiredFields() = if (chapter == null) listOf("Chapter") else emptyList()

    override fun setRequiredField(field: String, value: String) {
        if (field == "Chapter") chapter = value
    }

    override fun getErrors(): List<String> {
        val errors = mutableListOf<String>()
        // check sergeant
        val sergeants = models.count { it is SpaceMarineSergeant }
        if (sergeants != 1) errors.add("This unit should contain 1 Space Marine Sergeant")
        // check marines
        val marines = models.count { it is SpaceMarine }
        if (marines < 4 || marines > 9) errors.add("This unit should contain 4-9 Space Marines")
        return errors
    }
}