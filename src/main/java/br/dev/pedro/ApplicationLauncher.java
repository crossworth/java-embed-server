package br.dev.pedro;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;

public class ApplicationLauncher {

    public static void main(String[] args) throws LifecycleException {

        // setup tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.getConnector();

        Context ctx = tomcat.addContext("", null); // context and docBase (dir with static files)
        Wrapper servlet = Tomcat.addServlet(ctx, "myServlet", new MyServlet()); // register the servlet
        servlet.setLoadOnStartup(1); // load the servlet on startup (otherwise it will load on the first request)
        servlet.addMapping("/*"); // our servlet will handle all requests

        tomcat.start();
    }
}
