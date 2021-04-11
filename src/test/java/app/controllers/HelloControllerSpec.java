package app.controllers;

import org.javalite.activeweb.ControllerSpec;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloControllerSpec extends ControllerSpec {

    void findTextFor(String action, String text) {
        request().get(action);
        assertTrue(responseContent().contains(text), "Could not find: '" + text + "'");
    }

    @Test
    void index() {
        findTextFor("index", "hello");
    }

    @Test
    void fm() {
        findTextFor("fm", "John");
    }
}
