package app.controllers;

import org.javalite.activeweb.AppController;

public class RootController extends AppController {
    public void index() {
        // This method must exist for the root route to render
        // The root template will be rendered at:
        //   src/main/webapp/WEB-INF/views/root/index.ftl
    }
}
