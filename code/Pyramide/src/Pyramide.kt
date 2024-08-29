fun main(args: Array<String>){

   for(int in args ) {
      pyramide(int.toInt())

   }
}




fun pyramide(hauteur:Int){

    var nbEtoiles: Int = 1; //Premiere ligne a 1 etoile
    var espace: Int = 3
    var ligne: String = ""

    for(i: Int in 1.. hauteur){
        ligne = " ".repeat(espace) + "*".repeat(nbEtoiles)
        espace --
        nbEtoiles += 2
        println(ligne)
    }


}
