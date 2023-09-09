package in.co.hsbc.foodapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import in.co.hsbc.foodapp.configuration.RestaurantAppWebConfiguration;

//This class is responsible for registering and configuring dispatcher servlet

public class RestaurantAppWebConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {RestaurantAppWebConfiguration.class};
	}

	//This pattern is for URL pattern
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
