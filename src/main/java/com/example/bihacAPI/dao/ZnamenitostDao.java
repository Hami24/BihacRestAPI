package com.example.bihacAPI.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bihacAPI.domain.Znamenitost;


@Repository
public class ZnamenitostDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Znamenitost> getAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		List <Znamenitost> znamenitosti = currentSession.createQuery("from Znamenitost").list();
		return znamenitosti;
	}

	@SuppressWarnings("unchecked")
	public Znamenitost findById(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from Znamenitost where id = :id");
		query.setParameter("id", id);
		Znamenitost znamenitosti = (Znamenitost) query.uniqueResult();
		return znamenitosti;
	}
	
	
}
