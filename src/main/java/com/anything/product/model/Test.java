package com.anything.product.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Test {
	
	@Id
	private String userId;
	private String name;
	private Date creationDate = new Date();
	
}
