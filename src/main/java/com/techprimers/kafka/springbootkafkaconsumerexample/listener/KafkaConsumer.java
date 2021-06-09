package com.techprimers.kafka.springbootkafkaconsumerexample.listener;

import com.techprimers.kafka.springbootkafkaconsumerexample.model.BooksRepository;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.User;
import com.techprimers.kafka.springbootkafkaconsumerexample.model.Userservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	/*
	 * @KafkaListener(topics = "Kafka_Example", group = "group_id") public void
	 * consume(String message) { System.out.println("Consumed message: " + message);
	 */
	@Autowired  
	BooksRepository booksRepository;
	
	@Autowired  
	Userservice userservice; 
	


    @KafkaListener(topics = "items_topic", group = "group_json",
            containerFactory = "yourListenerFactory1")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
        String s = user.getDept();
        System.out.println("Consumed JSON Message: " + s);
        userservice.saveorupdate(user); 
        System.out.println("Success");
         
    }
    
    
    
}
