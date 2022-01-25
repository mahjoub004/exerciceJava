package com.webforce3.poo1;

public class User {

	private  String name;
	private  String address;
	private  String email;
	private  String passWord;
	
	public User(String name, String address, String email, String passWord) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.passWord = passWord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", email=" + email + ", passWord=" + passWord + "]";
	}
	
	
	
	
	
}
