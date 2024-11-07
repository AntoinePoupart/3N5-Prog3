fun uneFonction(){
    try {
        //du code…
    } catch (e: Exception){
        println("Erreur : $e")
    } catch (a: ArrayIndexOutOfBoundsException){
        println("Erreur : $a")
    }
}

    
Pas bon car l'ordre des catchs n'est pas bonne, 
catch (a: ArrayIndexOutOfBoundsException) devrais être avant le bloc catch (e: Exception)



fun calculerPoidsSupernova() {
try {
//calculs compliqués...
} catch (e: NumberFormatException) {}
}

Oui il est bon même si il n'a pas de printLn mais il est important de ne pas
laisser les blocs catch vides