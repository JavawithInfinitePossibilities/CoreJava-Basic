/**
 * 
 */
package com.java.basic.bean.immutability;

/**
 * @author Siddhant sahu
 *Why should we declare the Immutable class as final?
 *Ans:
 *There is a possibility that the child class can override the parent class getValue method. 
 *In that condition the immutable object will return the new value. To stop that kind of inheritance
 *we need to declare the class as final.
 */
public class ImmutableClass {
	private final int value;

	public ImmutableClass(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

}
