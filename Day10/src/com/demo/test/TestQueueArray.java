package com.demo.test;
import com.demo.service.*;
public class TestQueueArray {

	public static void main(String[] args) {
		QueueArray qlist = new QueueArray();
		qlist.enQueue(45);
		qlist.enQueue(26);
		qlist.enQueue(63);
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
		System.out.println(qlist.deQueue());
	}

}
