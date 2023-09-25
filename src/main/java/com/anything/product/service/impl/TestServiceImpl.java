package com.anything.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anything.product.dal.TestRepository;
import com.anything.product.model.Test;
import com.anything.product.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestRepository testRepo;
	
	@Override
	public List<Test> getAllTests() {
		return testRepo.findAll();
	}
	
	@Override
	public Test createTest(Test t) {
		return testRepo.insert(t);
	}

}
