package com.demo.service;

public class Hashing {
Node [] head;
class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		next=null;
		
	}
}
public Hashing() {
	head=new Node[10];
	for(int i=0;i<head.length;i++) {
		head[i]=null;
	}
}

public Hashing(int size) {
	head= new Node[size];
	for(int i=0;i<head.length;i++) {
		head[i]=null;
}
}

public void insertData(int val) {
	Node newNode = new Node(val);
	int pos=val%head.length;
	if(head[pos]==null) {
		head[pos]=newNode;
	}
	else {
		newNode.next=head[pos];
		head[pos]=newNode;
	}
	
}


public void displayHashing() {
	for(int i = 0;i<head.length;i++) {
		Node temp=head[i];
		System.out.println(i+"--->");
		while(temp!=null) {
			System.out.println(temp.data+"--->");
			temp=temp.next;
		}
		System.out.println("null");
	}
}

public boolean searchData(int num) {
	int pos = num%head.length;
	Node temp = head[pos];
	while(temp!=null) {
		if(temp.data==num) {
			System.out.println(num+" found");
			return true;
		}
		temp=temp.next;
	}
	System.out.println(num+" not found");
	return false;
}


}
