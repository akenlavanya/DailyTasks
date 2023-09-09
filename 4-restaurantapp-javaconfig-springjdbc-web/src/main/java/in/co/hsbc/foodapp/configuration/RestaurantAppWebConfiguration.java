package in.co.hsbc.foodapp.configuration;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan("in.co.hsbc.foodapp")
public class RestaurantAppWebConfiguration 
{
}
