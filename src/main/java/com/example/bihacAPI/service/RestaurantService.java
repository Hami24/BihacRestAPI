package com.example.bihacAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bihacAPI.dao.RestaurantDao;
import com.example.bihacAPI.domain.Restaurant;

@Service
public class RestaurantService {
	
	@Autowired
	private RestaurantDao restaurantDao;
	
	@Transactional
	public List<Restaurant> getAllRestaurants() {
		return restaurantDao.getAllRestaurants();
	}

	@Transactional
	public Restaurant findById(int id) {
		return restaurantDao.findById(id);
	}
}
