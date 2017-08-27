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
		ItemListExtends<Employee> emplyee = new ItemListExtends<Employee>(new Employee());
		emplyee.displayObject();
		ItemListExtends<FinanceOfficer> financeOfficer = new ItemListExtends<FinanceOfficer>(new FinanceOfficer());
		financeOfficer.displayObject();
		ItemListExtends<Manager> manager = new ItemListExtends<Manager>(new Manager());
		manager.displayObject();
		/*ItemListExtends<String> string = new ItemListExtends<String>(new String());
		manager.displayObject();*/
		List<? super Steel> steels = new ArrayList<Steel>();
		steels.add(new BreakableSteel());
		steels.add(new UnbreakableSteel());
		/*steels.add(new Iron());
		steels.add(new metal());*/
	}
}
