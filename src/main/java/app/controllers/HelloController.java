package app.controllers;

import app.Main;
import app.utils.JTE;
import com.google.template.soy.SoyFileSet;
import com.google.template.soy.tofu.SoyTofu;
import org.javalite.activeweb.AppController;

import java.util.HashMap;
import java.util.Map;

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

    public HttpBuilder soy() {
        // https://github.com/google/closure-templates/blob/master/documentation/codelabs/helloworlds/helloworld_java.md
        SoyFileSet sfs = SoyFileSet
                .builder()
                .add(Main.class.getResource("simple.soy"))
                .build();
        SoyTofu tofu = sfs.compileToTofu();
        final String rendered = tofu.newRenderer("app.simple.helloWorld").render();
        System.out.println(rendered);
        return respond(rendered);
    }

    public HttpBuilder soy2() {
        // https://github.com/google/closure-templates/blob/master/documentation/codelabs/helloworlds/helloworld_java.md
        SoyFileSet sfs = SoyFileSet
                .builder()
                .add(Main.class.getResource("simple.soy"))
                .build();
        SoyTofu tofu = sfs.compileToTofu();
        // helloName
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Michael");
        data.put("age", 98);
        final String rendered = tofu.newRenderer("app.simple.helloName").setData(data).render();
        System.out.println(rendered);
        return respond(rendered);
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
