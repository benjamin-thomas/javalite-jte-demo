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

    public HttpBuilder loader() {
        return respond(getClass().getClassLoader().toString());
    }

    public HttpBuilder world2() {
        var page = new HelloPage("John", 101);
        return respond(JTE.render("hello/hello.jte", page, getClass().getClassLoader()));
    }

    public class HelloPage {
        private final String name;
        private final int age;

        public HelloPage(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getUserName() {
            return name;
        }
    }


}
