package org.roni.man;

import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ParserTest extends ScenarioTest<GivenParserTest, WhenParserTest, ThenParserTest> {

    @ProvidedScenarioState
    ManPageParser parser = new ManPageParser();

    @Test
    public void something_should_happen() throws IOException {
        given().man_page_exists();
        when().man_page_is_parsed();
        then().application_is_set();
    }
}

