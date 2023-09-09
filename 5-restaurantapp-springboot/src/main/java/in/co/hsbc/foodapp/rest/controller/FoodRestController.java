package in.co.hsbc.foodapp.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.co.hsbc.foodapp.model.FoodItem;
import in.co.hsbc.foodapp.service.FoodService;

@RestController
public class FoodRestController {
	
	@Autowired
	private FoodService service;
	
	@GetMapping("/food")
	public List<FoodItem> findAllFoodItems()
	{
		return this.service.findAll();
	}
}
