package com.nexo.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.ai.model.Example;
import com.nexo.ai.service.MongoService;

@CrossOrigin
@RestController
public class MongoController {

	@Autowired
	MongoService mongo;
	
	@PostMapping(value = "api/mongo/create")
	public Object save(@RequestBody Example object) {
		return mongo.save(object);
	}
	
	@DeleteMapping(value = "api/mongo/delete")
	public Object delete(@RequestBody String docId) {
		return mongo.delete( docId);
	}

	@GetMapping(value = "api/mongo")
	public Object list(){
		return mongo.list();
	}
	
}
