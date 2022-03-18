package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;



@Entity(name="Address")
public class Employee {
	@Column(name="pincode")
  private int Address_pin;
	private String city;
	@Column(name="st1")
	private String state;
	@Transient
	private double x;
	public int getAddress_pin() {
		return Address_pin;
	}
	public void setAddress_pin(int address_pin) {
		Address_pin = address_pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	} 
	
	
  
	
}
