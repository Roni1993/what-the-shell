package org.roni.man;

import com.tngtech.jgiven.Stage;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class GivenParserTest extends Stage<GivenParserTest> {
    public GivenParserTest man_page_exists() throws IOException {
        return self();
    }
}