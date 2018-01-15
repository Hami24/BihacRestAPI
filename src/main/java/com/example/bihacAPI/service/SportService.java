package com.example.bihacAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.bihacAPI.dao.SportDao;
import com.example.bihacAPI.domain.Sport;

@Service
public class SportService {
	
	@Autowired
	private SportDao sportDao;
	
	@Transactional
	public List<Sport> getAll() {
		return sportDao.getAll();
	}

	@Transactional
	public Sport findById(int id) {
		return sportDao.findById(id);
	}
}
