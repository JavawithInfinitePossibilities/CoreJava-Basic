/**
 * 
 */
package com.java.basic.generic.test;

import java.util.ArrayList;
import java.util.List;

import com.java.basic.bean.BreakableSteel;
import com.java.basic.bean.Employee;
import com.java.basic.bean.FinanceOfficer;
import com.java.basic.bean.Iron;
import com.java.basic.bean.Manager;
import com.java.basic.bean.Steel;
import com.java.basic.bean.UnbreakableSteel;
import com.java.basic.generic.ItemList;
import com.java.basic.generic.ItemListExtends;
import com.sun.swing.internal.plaf.metal.resources.metal;

/**
 * @author Siddhant sahu
 *
 */
public class TestGeneric {
	public static void main(String[] args) {
		ItemList<String> itemList = new ItemList<String>(5);
		itemList.add("Rice");
		itemList.add("Wheat");
		itemList.add("Pen");
		itemList.add("pencil");
		System.out.println(itemList);
		ItemListExtends<Employee> emplyee = new ItemListExtends<Employee>(new Employee(1, "ABC"));
		emplyee.displayObject();
		ItemListExtends<FinanceOfficer> financeOfficer = new ItemListExtends<FinanceOfficer>(new FinanceOfficer(2, "ABC"));
		financeOfficer.displayObject();
		ItemListExtends<Manager> manager = new ItemListExtends<Manager>(new Manager(3, "ABC"));
		manager.displayObject();
		/*ItemListExtends<String> string = new ItemListExtends<String>(new String());
		manager.displayObject();*/
		List<? super Steel> steels = new ArrayList<Steel>();
		steels.add(new BreakableSteel());
		steels.add(new UnbreakableSteel());
		/*steels.add(new Iron());
		steels.add(new metal());*/
		System.out.println(Math.round(9*1000d));
		System.out.println(20*5+10);
	}
}
