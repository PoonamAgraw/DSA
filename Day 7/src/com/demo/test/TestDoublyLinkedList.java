package com.demo.test;
import com.demo.service.*;
public class TestDoublyLinkedList {
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.addNode(54);
		dlist.displayData();
		dlist.addNode(6);
		dlist.displayData();
		dlist.addNode(82);
		dlist.displayData();
		dlist.addNode(11);
		dlist.displayData();
		dlist.deleteByVal(82);
		dlist.displayData();
		dlist.addByPosition(4, 52);
		dlist.addByValue(6, 12);
		dlist.displayData();
		dlist.deleteByPosition(4);
		dlist.displayData();
	}

}
