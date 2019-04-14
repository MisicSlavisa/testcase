package com.testcase.web;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.ContextLoader;

public class MyContextLoaderListener extends ContextLoader implements ServletContextListener {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("************** Starting up! **************");
        initWebApplicationContext(sce.getServletContext());
    }

    @Override
    public void contextDestroyed(ServletContextEvent event) {

        System.out.println("************** Shutting down! **************");

        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        // This manually deregisters JDBC driver, which prevents Tomcat 7 from complaining about memory leaks wrto this class
        Enumeration<Driver> drivers = DriverManager.getDrivers();

        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            if (driver.getClass().getClassLoader() == cl) {
                try {
                    DriverManager.deregisterDriver(driver);
                    logger.info(String.format("deregistering jdbc driver: %s", driver));
                } catch (SQLException e) {
                    logger.info(String.format("Error deregistering driver %s", driver), e);
                }
            }
        }

        closeWebApplicationContext(event.getServletContext());
    }
}
