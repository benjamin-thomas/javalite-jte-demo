package app;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AllowSymLinkAliasChecker;
import org.eclipse.jetty.webapp.WebAppContext;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("---> Running app on localhost:8083");
        Server server = new Server(8083);

        System.out.println("Enabling active reload (recompiles controllers)");
        System.setProperty("active_reload", "true");

        WebAppContext webapp = new WebAppContext("src/main/webapp", "/");
        webapp.addAliasCheck(new AllowSymLinkAliasChecker());
        server.setHandler(webapp);
        server.start();
        server.dumpStdErr();
        server.join();
    }
}
