package com.nexo.ai.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nexo.ai.model.Example;
import com.nexo.ai.repository.MongoRep;

@Service
@Transactional
public class MongoService implements Mongo {

	@Autowired
	MongoRep mongorep;

	@Override
	public Example save(Example object) {
		try {
			return mongorep.save(object);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Object delete(String docID) {
		try {
			mongorep.delete(docID);
			return null;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public List<Example> list() {
		return mongorep.findAll();
	}

}
