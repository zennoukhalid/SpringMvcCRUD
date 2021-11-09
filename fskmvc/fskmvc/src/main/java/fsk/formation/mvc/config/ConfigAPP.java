package fsk.formation.mvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
 
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "fsk.formation.mvc")
public class ConfigAPP {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
	    	
	        InternalResourceViewResolver view = new InternalResourceViewResolver();
	        view.setPrefix("/WEB-INF/view/");
	        view.setSuffix(".jsp");
	        
	        return view;
	    
	}
	
    
}