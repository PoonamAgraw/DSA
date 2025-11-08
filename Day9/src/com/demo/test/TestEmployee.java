package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.*;


public class TestEmployee {

	public static void main(String[] args) {
		EmployeeService elist=new EmployeeService();
		elist.addNode(new Employee(1,"Raju",542154));
		elist.addNode(new Employee(10,"Maju",54254));
		elist.addNode(new Employee(45,"Paju",5154));
		elist.addNode(new Employee(6,"Taju",5421754));
		elist.displayData();
		System.out.println("----------------------------");
		elist.addAfterNum(new Employee(27,"Jaju",4578),45);
		elist.displayData();
		System.out.println("----------------------------");
		elist.deleteByValue(6);
		elist.deleteByValue(1);
		elist.deleteByValue(10);
		elist.displayData();
		elist.modifysalById(45,51145);
		elist.displayData();
	}

}
