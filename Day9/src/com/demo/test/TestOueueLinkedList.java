package com.demo.test;
import com.demo.service.*;
public class TestOueueLinkedList {
	public static void main(String[] args) {
		OueueLinkedList qlist = new OueueLinkedList();
		qlist.enQueue(45);
		qlist.enQueue(12);
		qlist.enQueue(23);
		qlist.enQueue(4);
		qlist.enQueue(52);
		qlist.enQueue(93);
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		qlist.displayData();
	}

}
