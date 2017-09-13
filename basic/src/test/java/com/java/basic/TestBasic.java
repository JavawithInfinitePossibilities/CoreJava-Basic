/**
 * 
 */
package com.java.basic;

import java.util.HashSet;
import java.util.Set;

import com.java.basic.bean.Person;

/**
 * @author Siddhant sahu
 *
 */
public class TestBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person person = new Person(1, "ABC");
		Person person2 = new Person(1, "ABC");
		Set<Person> persons = new HashSet<Person>();
		persons.add(person);
		persons.add(person2);
		System.out.println(persons.size());
		System.out.println(person.hashCode() + " : " + person2.hashCode());
	}

}
