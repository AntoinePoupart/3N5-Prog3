package org.example

import java.io.File

fun main(){

   val fichier = File("vide.txt")
    if (fichier.createNewFile()) {
        println("Fichier vide.txt créé avec succès.")
    }
    else{
        println("Le fichier ${fichier} existe déjà")
    }


    val fichierNom = File("../../nom_prenom.txt")
    val texte = "Poupart Antoine"
    fichierNom.writeText(texte)
    println("Le fichier nom_prenom.txt à été créé avec succès.")




}