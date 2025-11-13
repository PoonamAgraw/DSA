package com.demo.test;
import com.demo.service.*;
public class TestStackArray {
	public static void main(String[] args) {
		StackArray sa = new StackArray();
		sa.push(45);
		sa.push(63);
		sa.push(12);
		sa.push(52);
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		sa.displayData();
		
	}

}
