package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document


fun main() {
    println("Hello World!")
    var doc : Document = Jsoup.connect("http://example.com/").get();
}