package app.controllers;

import app.utils.JTE;
import org.javalite.activeweb.AppController;

public class HelloController extends AppController {
    public HttpBuilder index() {
        return respond("Hello world from HelloController#index! Now go to /hello/world");
    }

    public HttpBuilder world() {
        return respond("Hello world from HelloController#world! Now go to /hello/world2");
    }

    public HttpBuilder world2() {
        app.HelloPage page = new app.HelloPage(); // this works
        page.userName = "John";

        return respond(JTE.render("hello/hello.jte", page));
    }

}
