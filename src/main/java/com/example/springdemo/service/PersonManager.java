package com.example.springdemo.service;

import org.springframework.stereotype.Component;

import com.example.springdemo.domain.Person;

@Component
public class PersonManager {

	private Person person;

	public PersonManager(){

	}

	public PersonManager(Person person){
		this.person = person;
	}

	public String sayName() {
		return "I'm " + person.getFirstName() + "!";
	}

	public Person getFather(){
		return person.getFather();
	}

	public Person getMother(){
		return person.getMother();
	}

}
