package fsk.formation.mvc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppInitializer implements WebApplicationInitializer {
	 
		@Override
	    public void onStartup(ServletContext servletContext) throws ServletException {
			
	        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
	        context.register(ConfigAPP.class);
	        context.register(ConfigJPA.class);
	        
	        DispatcherServlet servlet  = new DispatcherServlet(context);
	        ServletRegistration.Dynamic registration = servletContext.addServlet("DispatcherServlet", servlet);
	        registration.setLoadOnStartup(1);
	        registration.addMapping("/");
	          
	    }
}
