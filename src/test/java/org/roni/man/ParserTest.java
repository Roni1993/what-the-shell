package org.roni.man;

import com.tngtech.jgiven.annotation.ProvidedScenarioState;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;
import org.roni.man.model.Usage;

import java.io.IOException;

public class ParserTest extends ScenarioTest<GivenParserTest, WhenParserTest, ThenParserTest> {

    @ProvidedScenarioState
    ManPageParser parser = new ManPageParser();

    @Test
    public void check_parsing_for_ssh() throws IOException {
        given().man_page_for_$_exists("ssh");
        when().man_page_is_parsed();
        then().application_is_set("ssh")
                .and().title_is_set("ssh — OpenSSH remote login client")
                .and().usage_is_set(new Usage())
                .and().options_are_set();
    }

    @Test
    public void check_parsing_for_sleep() throws IOException {
        given().man_page_for_$_exists("sleep");
        when().man_page_is_parsed();
        then().application_is_set("ssh")
                .and().title_is_set("ssh — OpenSSH remote login client")
                .and().usage_is_set()
                .and().options_are_set();
    }

    @Test
    public void check_parsing_for_wc() throws IOException {
        given().man_page_for_$_exists("wc");
        when().man_page_is_parsed();
        then().application_is_set("ssh")
                .and().title_is_set("ssh — OpenSSH remote login client")
                .and().usage_is_set()
                .and().options_are_set();
    }
}

