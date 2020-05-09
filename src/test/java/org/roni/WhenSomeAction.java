package org.roni;
import com.tngtech.jgiven.Stage;

//test whenStep
public class WhenSomeAction extends Stage<WhenSomeAction> {
    public WhenSomeAction some_action() {
        return self();
    }
}