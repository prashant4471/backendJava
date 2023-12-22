package com.anything.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anything.product.model.Test;
import com.anything.product.service.TestService;

@RestController
@RequestMapping(value = "/test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@GetMapping(value = "")
	public List<Test> getAllTest() {
		return testService.getAllTests(); 
	}
	
	@PostMapping(value = "/create")
	public Test insertTest(@RequestBody Test t) {
		return testService.createTest(t);
	}

}
