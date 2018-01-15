package com.example.bihacAPI.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bihacAPI.domain.Sport;


@Repository
public class SportDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Sport> getAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		List <Sport> centri = currentSession.createQuery("from Sport").list();
		return centri;
	}

	@SuppressWarnings("unchecked")
	public Sport findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from Sport where id = :id");
		query.setParameter("id", id);
		Sport centar = (Sport) query.uniqueResult();
		return centar;
	}
	
	
}
