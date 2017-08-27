/**
 * 
 */
package com.java.basic.generic;

/**
 * @author Siddhant sahu
 *
 */
public class ItemList<T> {
	private T[] dataStore;
	private int size;
	private int position;

	public ItemList(int size) {
		super();
		this.size = size;
		this.position = 0;
		this.dataStore = (T[]) new Object[this.size];
	}

	public void add(T element) {
		this.dataStore[this.position++] = element;
	}

	@Override
	public String toString() {
		String element = "";
		for (int i = 0; i < this.position; i++) {
			element += this.dataStore[i]+" ";
		}
		return element;
	}

}
