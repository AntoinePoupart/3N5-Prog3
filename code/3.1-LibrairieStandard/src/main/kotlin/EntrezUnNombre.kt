package org.example

fun main() {
    var question: String = "Veuillez entrer un nombre : "

    while(true){
        println(question)
        try{
            var nb: Int = readln().toInt()
            println("Merci, votre nombre est ${nb} ")
            return
        }
        catch (e:Exception){
            println("Ceci n’est pas un nombre, veuillez entrer un nombre :")
        }
        }
    }


