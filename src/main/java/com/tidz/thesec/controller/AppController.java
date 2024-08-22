package com.tidz.thesec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tidz.thesec.repository.UserRepository;

@Controller
public class AppController {

	@Autowired
	private UserRepository repo;

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

}
