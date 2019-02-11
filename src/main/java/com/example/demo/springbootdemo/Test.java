package com.example.demo.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping("/test")
	public Student welcome() {
		
		Student st = new Student("anji", 34, "Ternekal");
		return st;
	}

}

class Student {
	private String name;
	private int age;
	private String location;
	public Student(){
	}
	public Student(String name, int age, String location) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}