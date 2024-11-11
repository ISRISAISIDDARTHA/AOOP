package Voting_System;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Admin admin = new Admin(); 
        ServletContext context = sce.getServletContext();
        context.setAttribute("admin", admin); 
        System.out.println("Admin object initialized and added to context.");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Clean up resources if needed
    }
}

