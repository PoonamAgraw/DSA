package com.demo.test;
import java.util.*;

import com.demo.service.SinglyLinkList;
public class TestSinglyLinkedList {

	public static void main(String[] args) {
		SinglyLinkList slist = new SinglyLinkList();
		slist.addNode(2);
		slist.addNode(56);
		slist.addNode(26);
		slist.addNode(12);
		slist.addNode(90);
		System.out.println("-----------");
		slist.displayData();
		
	}

}
