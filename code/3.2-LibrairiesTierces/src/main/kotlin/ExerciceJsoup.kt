import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main(args: Array<String>){
    val url = args[0]
    val doc: Document = Jsoup.connect(url).get()
    
    val link: Element? = doc.select("a").first()

    println(link)
}

