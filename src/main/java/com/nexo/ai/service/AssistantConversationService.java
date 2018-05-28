package com.nexo.ai.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.watson.developer_cloud.assistant.v1.Assistant;
import com.ibm.watson.developer_cloud.assistant.v1.model.InputData;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageOptions;
import com.ibm.watson.developer_cloud.assistant.v1.model.MessageResponse;

@Service
@Transactional
public class AssistantConversationService implements AssistantConversation {

	final private String USERNAME= "";
	final private String PASSWORD= "";
	final private String wORKSPACEID= "";
	
	public Object postMessage(String line) {
		Assistant service = new Assistant("2018-02-16");
		service.setUsernameAndPassword(USERNAME, PASSWORD);

		InputData input = new InputData.Builder().build();
		MessageOptions options = new MessageOptions.Builder(wORKSPACEID).input(input)
				.build();
		MessageResponse response = service.message(options).execute();
		System.out.println(response);

		return response;
	}

}
