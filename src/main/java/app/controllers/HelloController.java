package app.controllers;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import org.javalite.activeweb.AppController;

import java.nio.file.Path;

public class HelloController extends AppController {
    public HttpBuilder index() {
        return respond("Hello world from HelloController#index! Now go to /hello/world");
    }

    public HttpBuilder world() {
        return respond("Hello2 world from HelloController#world!");
    }

    public HttpBuilder world2() {
        // Tell jte where your template files are located
        var codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "jte"));

        // Create the template engine (usually once per application)
        var templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);

        // Render
        var output = new StringOutput();
        System.out.println("---> before render");
        templateEngine.render("hello.jte", "World2", output);
        System.out.println("---> after render");
        return respond(output.toString()); // not sure if that'll work
    }
}
