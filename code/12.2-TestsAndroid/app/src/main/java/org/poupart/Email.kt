package org.poupart

fun main(){
val Email = listOf(
    //Courriel valide
    "bob@smith.org", "a.b.c@pipo.com", "Rodgere.Federer@tennis.info",
    //Courriel invalide
    "bob@smith", "a..b@popi.org", "john.doe@.com", "john.doe@plop.c"
)

    for(i in Email.indices){
        val Emails = Email[i]
        println("Courriel : $Emails - Valide : ${isValidEmail(Emails)}")
    }
}



fun isValidEmail(courriel: String): Boolean {
    // Expression régulière pour valider une adresse email
    val regex = "^[a-zA-Z0-9._%+-]([a-zA-Z0-9._%+-]?[a-zA-Z0-9])+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$".toRegex()
    return courriel.matches(regex)
}