import kotlin.random.Random

fun main(){
   val tableau = creeTableauAleatoire(100)
    stat(tableau)

}


fun creeTableauAleatoire(n: Int): Array<Int> {
//val randomValues = List(10) { Random.nextInt(0, 100) }
//   return  randomValues.toIntArray()
    return Array(n) { Random.nextInt(0, 101) }


}

fun stat(tableau : Array<Int>){
    val somme = tableau.sum()
    val moyenne = tableau.average()
    val min = tableau.min()
    val max = tableau.max()

//    println("Tableau :  ${tableau.joinToString()}")
    println("Somme : " + somme)
    println("Moyenne : " + moyenne)
    println("Minimum : " + min)
    println("Maximum : " + max)

}