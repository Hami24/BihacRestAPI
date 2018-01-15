package com.example.bihacAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bihacAPI.domain.Sport;
import com.example.bihacAPI.service.SportService;

@RestController
@RequestMapping("/bihac/api")
public class SportsController {
	
	@Autowired
	private SportService sportService;
	
	@GetMapping("/sportskiCentri")
	public List<Sport> getAll(){
		return sportService.getAll();
	}
	
	@GetMapping("/sportskiCentri/{id}")
	public Sport getSportCenter(@PathVariable("id") int id) {
		return sportService.findById(id);
	}
}
