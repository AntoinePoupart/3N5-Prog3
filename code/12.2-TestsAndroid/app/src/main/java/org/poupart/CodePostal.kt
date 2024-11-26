package org.poupart

fun main(){

    val codePostal = listOf(
        "H1Y1E1",
        "H1Y 1E1",
        "h3Y 1E8",
        "H1Y-1E1",
        "h3Y-1E8",
        "H1Y  1E1", // Invalide (Trop d'espaces)
        "H1Y_1E1", // Invalide
        "h3U 1TO" // Invalide
    )


    for(i in codePostal.indices ){
        val codePostals = codePostal[i]
        println("Code postal : $codePostals - Valide : ${isValidZipCode(codePostals)}")
    }
}

fun isValidZipCode(zippy: String): Boolean {
    val regex = "^[a-zA-Z]\\d[a-zA-Z]([\\s-]?\\d[a-zA-Z]\\d)?$".toRegex()
    return regex.matches(zippy)
}