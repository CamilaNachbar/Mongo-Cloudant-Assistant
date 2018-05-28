package com.nexo.ai.service;

import org.springframework.stereotype.Component;

@Component
public interface AssistantConversation {
	
	public Object postMessage(String line);

}
