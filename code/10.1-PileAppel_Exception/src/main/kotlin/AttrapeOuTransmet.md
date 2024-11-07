fun main() {
    try {
        calcul()
        lireFichier()
    } catch (a: ArithmeticException) {
        println("Problème dans les valeurs du calcul")
    } catch (i: IllegalArgumentException) {
        println("Problème dans les paramètres du programme")		
    } catch (t: InterruptedException){
        println("Problème avec le thread en cours")
    } catch (io: IOException){
        println("Problème avec le fichier")
    }
}

fun lireFichier(){
    // Code qui lit un fichier...
    // Question : Catch ou laisse l'erreur se propager?
}

