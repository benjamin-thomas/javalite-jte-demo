package app.controllers;

import app.utils.JTE;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import org.javalite.activeweb.AppController;

import java.nio.file.Path;

public class Hello2Controller extends AppController {
    public HttpBuilder index() {
        return respond("Hello world from HelloController#index! Now go to /hello/world");
    }

    public HttpBuilder world() {
        return respond("Hello2 world from HelloController#world!");
    }

    public HttpBuilder world2() {
        Hello2Controller.HelloPage page = new Hello2Controller.HelloPage(); // this does not work
        page.userName = "Bob";
        page.userKarma = 1337;

        return respond(JTE.render("hello2/hello.jte", page));
    }

    public static class HelloPage {
        public String userName;
        public int userKarma;
    }
}
