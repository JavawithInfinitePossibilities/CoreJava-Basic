/**
 * 
 */
package com.java.basic.bean;

/**
 * @author Siddhant sahu
 *
 */
public class Manager extends Employee {
	public Manager(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Inside sub class Manager");
	}
}
