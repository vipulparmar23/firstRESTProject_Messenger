package com.vipul.rest.messenger.service;

import java.util.ArrayList;
import java.util.List;
import com.vipul.rest.messenger.model.*;


public class MessageService {

	public List<Message> getAllMessages(){
		Message m1 = new Message(1L, "Hello World", "Vipul Parmar");
		Message m2 = new Message(2L, "Good evening !!", "John Smith");
		
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
}
