fun main() {
    loop@do{
        val menu = """
         ::Welcome to Recipe Maker ::
         Please, select an option
         [1] Do a recipe
         [2] See my recipes
         [3] Exit
         _____________________________
    """.trimIndent()
        println(menu)

        val response: String? = readLine()

        when (response){
            "1" -> println("You selected doing a new recipe")
            "2" -> println("You selected seeing your recipes")
            "3" -> break@loop
            else -> println("Enter a valid option, please")
        }
    }while(true)

}