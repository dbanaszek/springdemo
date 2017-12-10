package com.example.springdemo.domain;

public class Person {
	
	private String firstName = "Jan";
	private int yob = 1945;

	private Person father = null;
	private Person mother = null;

	public Person(){

	}

	public Person(Person father, Person mother){
		this.father = father;
		this.mother = mother;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getYob() {
		return yob;
	}
	public void setYob(int yob) {
		this.yob = yob;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}
}
