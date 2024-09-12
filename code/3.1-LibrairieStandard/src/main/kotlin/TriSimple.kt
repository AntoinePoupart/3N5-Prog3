package main.kotlin

fun main(args: Array<String>) {

    val liste1: MutableList<Double> = mutableListOf()
    for(i in args){
        val number = i.toDouble()
        liste1.add(number)
    }

    triInverseALaMain(liste1)
    triInverse(liste1)

}


fun triInverseALaMain(liste: List<Double>) {
//    val liste1: MutableList<Double> = mutableListOf()
//    for(i in )
////
////
////    println(listeTriee)
}

fun triInverse(liste: List<Double>) {
    var listeInverse: List<Double> = liste.reversed()
    println(listeInverse)
}
