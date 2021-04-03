package app.utils;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;

import java.nio.file.Path;

public class JTE {
    public static String render(String name, Object param) {
        // Tell jte where your template files are located
        var codeResolver = new DirectoryCodeResolver(Path.of("src", "main", "jte"));

        // Create the template engine (usually once per application)
        boolean isDev = true; // set to false and `mvn install` should fail
        TemplateEngine templateEngine;
        if (isDev) {
            templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);
        } else {
            templateEngine = TemplateEngine.createPrecompiled(Path.of("jte-classes"), ContentType.Html);
        }

        // Render
        var output = new StringOutput();
        templateEngine.render(name, param, output);
        return output.toString();
    }
}
