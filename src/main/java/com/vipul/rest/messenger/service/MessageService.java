package com.vipul.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.vipul.rest.messenger.database.DatabaseClass;
import com.vipul.rest.messenger.model.*;

public class MessageService {

	public MessageService() {
		messages.put(1L, new Message(1, "what's up?", "Vipul Parmar"));
		messages.put(2L, new Message(2, "Hey There !!", "Vipul Parmar"));
	}
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	// getMessage

	public Message getMessage(long id) {
		return messages.get(id);
	}

	// addMessage
	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	// updateMessage

	public Message updateMessage(Message message) {

		if (message.getId() <= 0) {
			return null;
		}

		messages.put(message.getId(), message);
		return message;
	}

	// removeMessage

	public Message removeMessage(long id) {
		return messages.remove(id);
	}

}
