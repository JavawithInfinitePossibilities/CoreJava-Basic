/**
 * 
 */
package com.java.basic.SequentialCollections.test;

import java.util.ArrayList;
import java.util.List;

import com.java.basic.SequentialCollections.ArrayListClass;

/**
 * @author Siddhant sahu
 *
 */
public class TestSequentialCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListClass arrayListClass=new ArrayListClass();
		List<Integer> list=new ArrayList<Integer>();
		list.add(300);
		list.add(400);
		list.add(500);
		arrayListClass.addAllArray(list);
		System.out.println(list);
	}

}
