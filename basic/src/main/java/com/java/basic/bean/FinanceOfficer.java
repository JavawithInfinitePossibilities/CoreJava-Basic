/**
 * 
 */
package com.java.basic.bean;

/**
 * @author Siddhant sahu
 *
 */
public class FinanceOfficer extends Person {
	public FinanceOfficer(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		System.out.println("Inside sub class FinanceOfficer");
	}
}
