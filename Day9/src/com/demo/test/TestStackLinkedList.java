package com.demo.test;
import com.demo.service.*;
public class TestStackLinkedList {
	public static void main(String[] args) {
		StackLinkesdList sa = new StackLinkesdList();
		sa.push(45);
		sa.push(63);
		System.out.println(sa.pop());
		System.out.println(sa.pop());
	}

}
