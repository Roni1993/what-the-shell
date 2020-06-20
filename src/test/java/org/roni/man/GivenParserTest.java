package org.roni.man;

import com.tngtech.jgiven.Stage;

import java.io.IOException;

public class GivenParserTest extends Stage<GivenParserTest> {
    public GivenParserTest man_page_for_$_exists(String ssh) throws IOException {
        return self();
    }
}