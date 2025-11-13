package com.demo.test;

import com.demo.service.*;

public class TestMyStackListGeneric {
	public static void main(String[] args) {
		MyStackListGeneric sa = new MyStackListGeneric();
		sa.push(45);
		sa.push(63);
		sa.push(5);
		sa.push(29);
		System.out.println(sa.pop());
		System.out.println(sa.pop());
		sa.displayData();
	}
}
