package com.galaxe.model;

public class PersonalDetails {
	private int age;
	private String email;
	private String name;
	@Override
	public String toString() {
		return "PersonalLoanCalculator [age=" + age + ", email=" + email + ", name=" + name + ", phNo=" + phNo + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	private String phNo;
}
