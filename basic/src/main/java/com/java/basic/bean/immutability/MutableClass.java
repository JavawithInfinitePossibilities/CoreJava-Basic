/**
 * 
 */
package com.java.basic.bean.immutability;

/**
 * @author Siddhant sahu
 *
 */
public class MutableClass extends ImmutableClass {
	private int realValue;

	public MutableClass(int value) {
		super(value);
		this.realValue = value;
	}

	/**
	 * Override the getValue method to get new value
	 */
	public int getValue() {
		return realValue;
	}

	public void setRealValue(int realValue) {
		this.realValue = realValue;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MutableClass mutableClass = new MutableClass(4);
		ImmutableClass immutableClass = mutableClass;
		System.out.println(immutableClass.getValue());
		mutableClass.setRealValue(8);
		System.out.println(immutableClass.getValue());
	}

}
