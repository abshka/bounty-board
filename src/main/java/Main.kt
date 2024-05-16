const val HERO_NAME = "Madrigal"

fun main() {
    println("The hero announces her presence to the world.")
    println(HERO_NAME)

    var playerLevel = 4
    println(playerLevel)

    val hasAngeredBarbarians = false
    val playerClass = "paladin"
    val hasBefriendedBarbarians = true

    val quest: String = when {
        playerLevel == 1 -> "Meet Mr. Bubbles in the land of soft things."
        playerLevel in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) "Convince the barbarians to call off their invasion."
            else "Save the town from the barbarian invasions."
        }
        playerLevel == 6 -> "Locate the enchanted sword."
        playerLevel == 7 -> "Recover the long-lost artifact of creation."
        playerLevel == 8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }

    println("The hero approaches the bounty board. It reads:")
    println(quest)

    println("Time passes...")
    println("The hero returns from her quest.")

    playerLevel += 1
    println(playerLevel)
}