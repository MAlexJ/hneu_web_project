package com.hneu.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @author malex
 */
public class AppInitializer implements WebApplicationInitializer {

    /**
     *
     */
    private final static String MAPPING_URL = "/";

    /**
     *
     */
    private final static String PATH_TO_CONFIG="com.hneu.configuration";

    /**
     *
     */
    private final static int LOAD_ON_STARTUP = 1;


    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        WebApplicationContext context = getContext();
        servletContext.addListener(new ContextLoaderListener(context));

        ServletRegistration.Dynamic dispatcher = servletContext.addServlet("DispatcherServlet", new DispatcherServlet(context));
        dispatcher.setLoadOnStartup(LOAD_ON_STARTUP);
        dispatcher.addMapping(MAPPING_URL);
        dispatcher.setMultipartConfig(getMultiPartConfigElement());
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation(PATH_TO_CONFIG);
        return context;
    }

    private MultipartConfigElement getMultiPartConfigElement() {
        return new MultipartConfigElement("", 2000000, 10000000, 0);
    }
}
