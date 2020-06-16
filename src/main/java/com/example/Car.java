package com.example;

public class Car {

	private String name;
	private Integer speed;
	
	public String changeName() {
		return this.name + "さん";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSpeed() {
		return speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
	
	
}
