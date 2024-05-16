fun main() {
    println("The hero announces her presence to the world")

    val HERO_NAME = "Madrigal"
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    val hasSteed = false
    if (!hasSteed) {
        println("$HERO_NAME doesn't have a steed yet.")
    }

    // Переменные для сцены в таверне
    val tavernName = "The Unicorn's Horn"
    val innkeeperName = "Brom"
    var playerCoins = 50

    // Меню напитков в виде списка
    val drinkMenu = listOf("Mead", "Wine", "Beer")

    println("$HERO_NAME arrives at $tavernName.")
    println("$innkeeperName the innkeeper asks, \"Do you need a stable?\"")
    println("\"No,\" $HERO_NAME replies, \"I don't have a steed. But I have $playerCoins coins, and I'd like a drink.\"")
    println("\"Wonderful!\" says $innkeeperName. \"We have ${drinkMenu.joinToString(", ")} on the menu. What would you like?\"")



    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)
}