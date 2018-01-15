package com.example.bihacAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bihacAPI.dao.ZnamenitostDao;
import com.example.bihacAPI.domain.Znamenitost;

@Service
public class ZnamenitostService {
	
	@Autowired
	private ZnamenitostDao znamenitostDao;
	
	@Transactional
	public List<Znamenitost> getAll() {
		return znamenitostDao.getAll();
	}

	@Transactional
	public Znamenitost findById(int id) {
		return znamenitostDao.findById(id);
	}
}
