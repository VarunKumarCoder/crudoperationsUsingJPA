package com.cd.sender;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

public class ActiveMqMessageSenderRunner implements CommandLineRunner {

	@Autowired
	private JmsTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		/*template.send("testmq1",new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				Message message=session.createTextMessage("From Sender at::"+new Date());
				return message;
			}	
		});*/
		
		/*template.send("testmq1",ses->{
			return ses.createTextMessage("From senderat"+new Date());
		});*/
		
		template.send("testmq1",ses-> ses.createTextMessage("From sender ar"+new Date()));
		System.out.println("Message sent");
	}
}
