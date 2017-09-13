/**
 * 
 */
package com.java.basic.SequentialCollections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Siddhant sahu
 *
 */
public class ArrayListClass {
	private static final List<Integer> INTEGERS = new ArrayList<Integer>();

	public ArrayListClass() {
	}

	public void add(Integer value) {
		INTEGERS.add(value);
	}

	public void addAllArray(List<Integer> values) {
		values = new ArrayList<Integer>();
		values.add(100);
		values.add(200);
		// values=new ArrayList<Integer>();
	}

	public void getObject(Object obj) {
		System.out.println("This is object class...");
	}

	public void getObject(String obj) {
		System.out.println("This is String class...");

	}

	public void getObject(int obj) {
		System.out.println("This is Integer class...");
	}
}
