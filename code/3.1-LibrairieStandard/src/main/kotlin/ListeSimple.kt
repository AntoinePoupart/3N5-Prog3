package org.example

fun main(){
  println(repete(4,2))
}

fun repete(n: Int, nombreFois: Int) : List<Int>{
    val resultat = mutableListOf<Int>()

    for(i in 1..n){
        repeat(nombreFois) {
            resultat.add(i)
            }
    }
     return resultat
}
