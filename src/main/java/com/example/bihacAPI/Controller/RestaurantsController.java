package com.example.bihacAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bihacAPI.domain.Restaurant;
import com.example.bihacAPI.service.RestaurantService;

@RestController
@RequestMapping("/bihac/api")
public class RestaurantsController {

	@Autowired
	private RestaurantService restaurantService;
	
	@GetMapping("/restorani")
	public List<Restaurant> getAllRestaurants()
	{
		return restaurantService.getAllRestaurants();
	}
	@GetMapping("/restorani/{id}")
	public Restaurant getRestaurant(@PathVariable("id")int id)
	{
		return restaurantService.findById(id);
	}
}
