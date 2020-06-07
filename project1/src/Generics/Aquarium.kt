package Generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}

class Aquarium<out T: WaterSupply>(val waterSupply: T)

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
}

fun main() {
    genericsExample()
}