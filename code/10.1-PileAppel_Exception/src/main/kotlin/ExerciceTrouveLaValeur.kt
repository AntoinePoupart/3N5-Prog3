fun main(){
    val tableau = arrayOf("pomme", "banane", "orange", "kiwi")

    // Test 1: Appel normal (élément trouvé)
    try {
        val index = trouveru(tableau, "kiwi")
        println("L'élément '${tableau[index]}' a été trouvé à l'index : $index")
    }
    catch (e: ElementNonTrouveException){
        println(e.message)
    }

    // Test 2: Appel exceptionnel (élément non trouvé)
    try {
        val index = trouveru(tableau, "poutine")
        println("L'élément ${tableau[index]} a été trouvé à l'index : $index")
    }
    catch (e : ElementNonTrouveException){
        print(e.message)
    }
}

class ElementNonTrouveException(message : String) : Exception(message)

fun trouveru(tableau : Array<String>, element : String): Int {
    for(i in tableau.indices){
        if(tableau[i] == element){
            return i
        }
    }
throw ElementNonTrouveException("L'élément '$element' n'a pas été trouvé dans le tableau")
}