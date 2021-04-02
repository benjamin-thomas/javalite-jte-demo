package app.controllers;

import org.javalite.activeweb.AppController;

public class HelloController extends AppController {
    public HttpBuilder index() {
        return respond("Hello world from HelloController#index! Now go to /hello/world");
    }

    public HttpBuilder world() {
        return respond("Hello world from HelloController#world!");
    }
}
