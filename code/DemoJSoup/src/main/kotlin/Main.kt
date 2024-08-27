package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements


fun main() {
    println("Hello World!")
    Jsoup.connect("http://example.com/").get();
    val doc = Jsoup.connect("https://en.wikipedia.org/").get()
    println(doc.title())
    val newsHeadlines: Elements = doc.select("#mp-itn b a")
    for (headline in newsHeadlines) {
        println(

            headline.attr("title") + headline.absUrl("href")
        )
    }


}