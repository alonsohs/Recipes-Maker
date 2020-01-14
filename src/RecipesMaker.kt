fun main() {
    loop@do{
        val menu = """
         ::Welcome to Recipe Maker ::
         Please, select an option
         [1] Make a recipe
         [2] View my recipes
         [3] Exit
         _____________________________
    """.trimIndent()
        println(menu)

        val response: String? = readLine()

        when (response){
            "1" -> makeRecipe()
            "2" -> viewRecipe()
            "3" -> break@loop
            else -> println("Enter a valid option, please")
        }
    }while(true)

}
fun makeRecipe(){
    makeRecipe@do{
        println("""
        Make a recipe
        Select ingredients of the following list
        [1] Water
        [2] Milk
        [3] Meat
        [4] Vegetables
        [5] Fruits
        [6] Cereal
        [7] Eggs
        [8] Oil

        [9] Return to menu
    """.trimIndent())
    val responseMakeRecipe = readLine()
    }while (true)
}
fun viewRecipe(){
    do {
        println("View my recipes")

        val response = readLine()
    }while (true)
}
