import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import javax.lang.model.util.Elements

fun main(args: Array<String>) {
    ExerciceJsoup(args)
    ValidationCourriel()
}

fun ExerciceJsoup(args: Array<String>) {
    val url = args[0]
    val doc: Document = Jsoup.connect(url).get()
    val link = doc.select("a")
    for (i in link.indices) {
        println(link[i].attr("href"))
    }

}

fun ValidationCourriel(){

    val listeEmail = listOf("jo@pipo.org", "ma_mu@m.ca", "a.a@a.ca", "a.a@a.aa", "ab@ab", "a.b@ab", "jo")

}