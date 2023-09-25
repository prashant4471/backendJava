package com.anything.product.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.anything.product.model.Test;

@Repository
public interface TestRepository extends MongoRepository<Test, String> {

}
