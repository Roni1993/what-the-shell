package org.roni;
import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

//jGiven example
public class MyShinyJGivenTest extends ScenarioTest<GivenSomeState, WhenSomeAction, ThenSomeOutcome>{
    @Test
    public void something_should_happen() {
        given().some_state();
        when().some_action();
        then().some_outcome();
    }
}
