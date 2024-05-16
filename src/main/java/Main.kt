fun main(){
    println("The hero announces her presence to the world")

    val HERO_NAME = "Madrigal"
    println(HERO_NAME)
    var playerLevel = 4
    println(playerLevel)

    val hasSteed = false
    if (!hasSteed) {
        println("$HERO_NAME doesn't have a steed yet.")
    }

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)
}