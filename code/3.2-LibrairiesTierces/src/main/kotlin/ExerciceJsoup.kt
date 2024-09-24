import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import javax.lang.model.util.Elements

fun main(args: Array<String>) {
    val url = args[0]
    val doc: Document = Jsoup.connect(url).get()
    val link = doc.select("a")
    for (i in link.indices){
        println(link[i].attr("href"))
    }

}

