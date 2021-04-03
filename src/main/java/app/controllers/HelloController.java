package app.controllers;

import app.utils.JTE;
import org.javalite.activeweb.AppController;

public class HelloController extends AppController {
    public static String indexPath = "/hello";

    public HttpBuilder index() {
        return respond("Hello world from HelloController#index! Now go to /hello/fm or /hello/jte");
    }

    public void fm() {
        var page = new ViewUser("John", 101);

        view("title", "Hello FM");
        view("page", page);
    }

    public HttpBuilder jte() {
        var page = new JteDataBag("John", 101, "Hello JTE");
        return respond(JTE.render("hello/hello.jte", page, getClass().getClassLoader()));
    }

    public static class ViewUser {
        @Override
        public String toString() {
            return "ViewUser{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        private final String name;
        private final int age;

        public ViewUser(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
    }

    public static class JteDataBag {
        private final String name;
        private final int age;
        private final String rootURL;
        private final String pageTitle;

        public JteDataBag(String name, int age, String pageTitle) {
            this.name = name;
            this.age = age;
            this.pageTitle = pageTitle;
            this.rootURL = "/";
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getRootURL() {
            return rootURL;
        }

        public String getPageTitle() {
            return pageTitle;
        }
    }


}
