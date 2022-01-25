package com.webforce3.poo1;

import java.util.Arrays;

public class Parking {
	
    private String name;
	private String address;
	private String phoneNumber;
	private int floor[] = {1,2,3,4,5,6,7,8};
	
	public Parking(String name, String address, String phoneNumber, int[] floor) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.floor = floor;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int[] getFloor() {
		return floor;
	}

	public void setFloor(int[] floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Parking [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", floor="
				+ Arrays.toString(floor) + "]";
	}
	
	
	
	
	

}
