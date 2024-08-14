package com.ashfaq.dev.models;

public class Student {
	
	String name;
	String gender;
	double marks;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String gender, double marks) {
		super();
		this.name = name;
		this.gender = gender;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", marks=" + marks + "]";
	}

	
	
	
}
