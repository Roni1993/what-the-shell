package org.roni.man;

import com.tngtech.jgiven.Stage;

public class ThenParserTest extends Stage<ThenParserTest> {
    public ThenParserTest application_is_set(String ssh) {

        return self();
    }

    public ThenParserTest title_is_set(String s) {
        return self();
    }

    public ThenParserTest usage_is_set() {
        return self();
    }

    public ThenParserTest options_are_set() {
        return self();
    }
}
