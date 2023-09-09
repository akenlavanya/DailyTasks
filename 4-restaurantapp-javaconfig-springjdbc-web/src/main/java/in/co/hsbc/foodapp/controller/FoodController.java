package in.co.hsbc.foodapp.controller;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.co.hsbc.foodapp.configuration.RestaurantApplicationConfiguration;
import in.co.hsbc.foodapp.model.FoodItem;
import in.co.hsbc.foodapp.service.FoodService;

public class FoodController {

	public static void main(String[] args) {

		try(AnnotationConfigApplicationContext container = new 
			AnnotationConfigApplicationContext(RestaurantApplicationConfiguration.class))
		{
			FoodService service = container.getBean(FoodService.class);
			
			//service.save(new FoodItem(7,"Laddu",900));
			
			//service.updateItem(new FoodItem(7,"Laddu",1000));
			service.deleteItem(6);
			List<FoodItem> allFoods = service.findAll();
			System.out.println(allFoods);
			
		}
	}
}