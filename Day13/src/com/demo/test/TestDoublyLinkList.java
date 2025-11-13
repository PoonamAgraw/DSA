package com.demo.test;
import com.demo.service.*;
public class TestDoublyLinkList {

	public static void main(String[] args) {
		DoublyLinkList dlist = new DoublyLinkList();
		dlist.addNode(23);
		dlist.addNode(42);
		dlist.addNode(85);
		dlist.addNode(12);
		dlist.addNode(62);
		dlist.displayReverseFromPosition(3);
		dlist.displayReverseFromPosition(6);
	}

}
