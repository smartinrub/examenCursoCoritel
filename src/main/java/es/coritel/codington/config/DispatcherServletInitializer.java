package es.coritel.codington.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer { 

     @Override 
     protected Class<?>[] getRootConfigClasses() { 
          return null; 
     } 

     @Override 
     protected Class<?>[] getServletConfigClasses() { 
          return new Class[] {FERSApplicationContextConfig.class }; 
     } 

     @Override 
     protected String[] getServletMappings() { 
          return new String[] { "/" }; 
     } 
} 

