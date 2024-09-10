package org.example

import java.io.File

fun main(args: Array<String>) {
    var nomFichier1: String = args[0]
    var fichier1: File = File(nomFichier1)
    if (fichier1.exists()) {
        try {
            var texte1: String = fichier1.readText()
            println(texte1)

            var liste1: List<String> = texte1.split("\n")
            println(liste1)

            var esapce: String = liste1.joinToString("\n-------------\n")
            println(esapce)

        } catch (e: Exception) {
            println("Le fichier $nomFichier1 ne peut pas être lu")
        }

    }
    else{
        println("Le fichier $nomFichier1 n'existe pas")
    }
}