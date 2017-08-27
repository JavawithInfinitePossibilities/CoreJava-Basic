/**
 * 
 */
package com.java.basic.generic;

import java.util.Arrays;

import com.java.basic.bean.Person;

/**
 * @author Siddhant sahu
 *
 */
public class ItemListExtends<T extends Person> {
	private T obj;

	public ItemListExtends(T obj) {
		super();
		this.obj = obj;
	}

	public void displayObject() {
		this.obj.display();
	}
}
