package com.sample.entities;

import com.google.gson.Gson;

public class Person {

	private Integer age;
	
	private String name;
	
	private Character gender;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}
	
	public String toString(){
		Gson gson = new Gson();
		return gson.toJson(this);
	}
	
}
