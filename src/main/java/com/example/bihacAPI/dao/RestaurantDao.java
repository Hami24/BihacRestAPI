package com.example.bihacAPI.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bihacAPI.domain.Restaurant;

@Repository
public class RestaurantDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Restaurant> getAllRestaurants() {
		Session currentSession = sessionFactory.getCurrentSession();
		List <Restaurant> restorani = currentSession.createQuery("from Restaurant").list();
		return restorani;
	}

	@SuppressWarnings("unchecked")
	public Restaurant findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from Restaurant where idRestorana = :id");
		query.setParameter("id", id);
		Restaurant restoran = (Restaurant) query.uniqueResult();
		return restoran;
	}
	
	
}
