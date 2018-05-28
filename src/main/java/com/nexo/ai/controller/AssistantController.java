package com.nexo.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nexo.ai.service.AssistantConversationService;

@CrossOrigin
@RestController
public class AssistantController {

	@Autowired
	 AssistantConversationService assistant;
	
	@PostMapping(value = "api/assistant")
	public Object save(@RequestBody String line) {
		return assistant.postMessage(line);
	}
}
