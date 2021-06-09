package com.techprimers.kafka.springbootkafkaconsumerexample.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.techprimers.kafka.springbootkafkaconsumerexample.listener.KafkaConsumer;

public interface BooksRepository extends JpaRepository <User, Integer>  
{ 

} 
