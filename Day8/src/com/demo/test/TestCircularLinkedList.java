package com.demo.test;
import com.demo.service.*;
public class TestCircularLinkedList {

	public static void main(String[] args) {
	CircularLinkedList clist = new CircularLinkedList();
    clist.addNode(67);
    clist.displayData();
    clist.addNode(12);
    clist.displayData();
    clist.addNode(8);
    clist.displayData();
    clist.addByPosition(3, 50);
    clist.displayData();
    clist.addByValue(54);
    clist.displayData();
    clist.deleteByposition(2);
    clist.displayData();
    clist.deleteByValue(8);
    clist.displayData();
	}

}
