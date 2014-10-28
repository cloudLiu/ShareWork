package com.CZAomai.share.core.entity;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Boss {

	private Car car;
	
	private Office office;
	
	@Autowired
	public Boss(Car car, Office office) {
		super();
		this.car = car;
		this.office = office;
	}

	public Boss(){}
	
	public Car getCar() {
		return car;
	}
	
	public void setCar(Car car) {
		this.car = car;
	}

	public Office getOffice() {
		return office;
	}
	
	public void setOffice(Office office) {
		this.office = office;
	}
	
//	public String toString()
//	{
//		return "I'm a boss,and I have a office named " + office.getName() + " and a car which is worth of " + car.getPrice() + "$.";
//	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("销毁boss!");
	}
	
}
