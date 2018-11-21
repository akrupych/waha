package akrupych.waha.data.base

import akrupych.waha.DicedNumber

sealed class WeaponType(val value: String) {
    class Pistol(hits: DicedNumber) : WeaponType("Pistol $hits")
    class RapidFire(hits: DicedNumber) : WeaponType("Rapid Fire $hits")
    class Grenage(hits: DicedNumber) : WeaponType("Grenage $hits")
}