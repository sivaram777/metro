package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
	@Autowired  
	BooksRepository booksRepository;
	
	public void saveorupdate(User user)   
	{  
	booksRepository.save(user);  
	}

}
