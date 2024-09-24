fun main(args: Array<String>){
    val motDeLaliste: Set<String> = args.toSet()
    var mot = motDeLaliste.sorted()
    mot.forEach{println(it)}
}