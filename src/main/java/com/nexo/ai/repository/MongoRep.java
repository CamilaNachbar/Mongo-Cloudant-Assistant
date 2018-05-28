package com.nexo.ai.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nexo.ai.model.Example;

@Repository
public interface MongoRep extends MongoRepository<Example, String> {

	@Override
	public List<Example> findAll();

	public Example save(Example object);

}