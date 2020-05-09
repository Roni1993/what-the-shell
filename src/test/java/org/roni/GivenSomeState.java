package org.roni;
import com.tngtech.jgiven.Stage;

//test givenStep
public class GivenSomeState extends Stage<GivenSomeState> {
    public GivenSomeState some_state() {
        return self();
    }
}