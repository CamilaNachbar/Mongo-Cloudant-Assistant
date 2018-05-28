package com.nexo.ai.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nexo.ai.model.Example;

@Component
public interface Mongo {
	public Example save(Example object);
	public Object delete( String docID);
	public List<Example> list();
}
