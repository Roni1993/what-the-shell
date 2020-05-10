package org.roni;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

/**
 * A simple example, used on the jsoup website.
 */
public class JsoupExample {
    public static void main(String[] args) throws IOException {

        //load from manpages.ubuntu
        Document doc = Jsoup.connect("http://manpages.ubuntu.com/manpages/artful/en/man1/ssh-add.1.html").get();
        log(doc.title());

        //select all the <h4>-tags
        Elements allHeaders = doc.select("h4");
        //all textblocks a separate from header tags
        Elements allTextBlocks = doc.select("pre");

        //iterate over all headers
        for (Element header : allHeaders) {
            log("%s",header.text());
        }
    }

    private static void log(String msg, String... vals) {
        System.out.println(String.format(msg, vals));
    }
}