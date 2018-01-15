package com.example.bihacAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bihacAPI.domain.Znamenitost;
import com.example.bihacAPI.service.ZnamenitostService;


@RestController
@RequestMapping("/bihac/api")
public class ZnamenitostiController {
	
	@Autowired
	private ZnamenitostService znamenitostService;
	
	@GetMapping("/znamenitosti")
	public List<Znamenitost> getAll(){
		return znamenitostService.getAll();
	}
	
	@GetMapping("/znamenitosti/{id}")
	public Znamenitost getSportCenter(@PathVariable("id") int id) {
		return znamenitostService.findById(id);
	}
}
