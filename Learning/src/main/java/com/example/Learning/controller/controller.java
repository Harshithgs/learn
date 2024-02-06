package com.example.Learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Learning.dao.dao;
import com.example.Learning.dto.Leo;

@Controller
public class controller {
	@Autowired
	dao d;
	@GetMapping("/")
	public String loadHome() {
		return "Home";
	}
	@PostMapping("/signup")
	public String signup(Leo l,ModelMap m){
		System.out.println(l);
		System.out.println(m);
		return d.insert(l,m);
	}
	@PostMapping("/login")
	public String login(Leo l,ModelMap m){
		System.out.println(l);
		System.out.println(m);
		m.put("data", l);
		return "view.html";
	}
}
