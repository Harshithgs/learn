package com.example.Learning.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import com.example.Learning.dto.Leo;
import com.example.Learning.repository.LeoReposistory;
@Component
public class dao {
	@Autowired
	LeoReposistory r;
	public String insert(Leo l,ModelMap m) {
		r.save(l);
		return "login.html";
	}
	
}
