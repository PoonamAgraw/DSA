package com.demo.test;
import com.demo.service.*;
public class TestLinkedList {

	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addNode(23);
		list.addNode(59);
		list.addNode(5);
		list.addNode(18);
		list.displayNode();
		list.addByPosition(1, 58);
		System.out.println();
		list.displayNode();
		list.addByNum(5, 5);
		System.out.println();
		list.displayNode();
//		list.deleteByValue(59);
//		System.out.println();
//		list.displayNode();
		list.deleteByPos(1);
		System.out.println();
		list.displayNode();
	}

}
 