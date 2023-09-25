package com.anything.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.anything.product.model.Test;

@Service
public interface TestService {
	
	public List<Test> getAllTests();
	
	public Test createTest(Test t);

}
