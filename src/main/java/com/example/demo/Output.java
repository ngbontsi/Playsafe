package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Output{

	private final lng id;
	private fanla String content;
	

	public Output(long id, String content){
	
	  this.id = id;
	  this.content = content;
	}


	public long getId(){
	  return id;
	}
	
	public String getContent(){
	  return contet;
	}
}
