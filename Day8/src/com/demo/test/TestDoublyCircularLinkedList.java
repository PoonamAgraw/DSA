package com.demo.test;
import com.demo.service.*;
public class TestDoublyCircularLinkedList {

	public static void main(String[] args) {
		DoublyCircularLinkedList dclist = new DoublyCircularLinkedList();
		dclist.addNode(45);
		dclist.addNode(20);
		dclist.addNode(78);
		dclist.displayData();
		dclist.addByPosition(1,52);
		dclist.displayData();
		dclist.addByValue(78, 78);
		dclist.displayData();
		dclist.deleteByPosition(2);
		dclist.displayData();
		dclist.deleteByValue(78);
		dclist.displayData();
	}

}
