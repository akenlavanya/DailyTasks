package in.co.hsbc.foodapp.service;

import java.util.List;

import in.co.hsbc.foodapp.model.FoodItem;

public interface FoodService {
	
	List<FoodItem> findAll();
	void updateItem(FoodItem f);
	FoodItem save(FoodItem food);
	void deleteItem(int id);
}
