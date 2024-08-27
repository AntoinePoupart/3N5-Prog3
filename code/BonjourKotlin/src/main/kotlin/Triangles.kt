fun main(){
    print(triangle(hauteur = 4))
    print(triangle(hauteur = 8))
    print(triangle(hauteur = 10))
    print(triangle(hauteur = 100))

}

fun triangle(hauteur : Int) : String {
    var maString: String = ""
    for(i in 1 .. hauteur){
        for(index in 1..i){
           maString += "*"
        }
        maString += "\n"
    }
    return maString
}