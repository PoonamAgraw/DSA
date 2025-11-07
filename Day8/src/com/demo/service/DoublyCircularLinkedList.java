package com.demo.service;

public class DoublyCircularLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}
		
	}
	public DoublyCircularLinkedList() {
		this.head = null;
	}
	public void addNode(int val) {
		Node newNode = new Node(val);
		if(head==null) {
			head = newNode;
			head.prev = head;
			head.next=head;
		}
		else {
			Node temp = head.prev;
			newNode.next=head;
			newNode.prev = temp;
			temp.next = newNode;
			head.prev=newNode;
		}
	}
	public void displayDataReverse() {
		Node temp = head.prev;
		do {
			System.out.println(temp.data+"--->");
			temp=temp.prev;
		}
		while(temp!=head.prev);
			System.out.println();
		
	}
	public void displayData() {
		Node temp=head;
		do {
			System.out.print(temp.data+"--->");
			temp=temp.next;
		}while(temp!=head);
		System.out.println();
		
	}
	
	public void addByPosition(int pos, int val) {
		if(head==null) {
			System.out.println("list is empty");
		}
		else {
			Node newNode = new Node(val);
			if(pos ==1) {
				Node temp = head.prev;
				temp.next = newNode;
				newNode.next=head;
				newNode.prev=temp;
				head.prev=newNode;
				head = newNode;
			}
			else {
				Node temp = head;
				int i=0;
				for(;temp.next!=head && i<pos-2;i++) {
					temp=temp.next;
				}
				if(i==pos-2) {
					newNode.prev=temp;
					newNode.next=temp.next;
					temp.next=newNode;
					newNode.next.prev=newNode;
					
				}else {
					System.out.println(pos + " is beyond the limit");
				}
			}
		}
	}
	
	public void addByValue(int val,int num) {
		Node temp = head;
		Node newNode = new Node(val);
		while(temp.next!=head&&temp.data!=num) {
			temp=temp.next;
			if(temp.data==num) {
				newNode.prev=temp;
				newNode.next=temp.next;
				temp.next=newNode;
				newNode.next.prev=newNode;
			}
			else {
				System.out.println("Number not found");
			}
		}
	}
	
	
	public void deleteByPosition(int pos) {
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node tail = head.prev;
			if(pos ==1) {
				if(head==tail) {
					head =null;
				}
				else {
					head.next.prev = tail;
					tail.next=head.next;
					Node temp = head;
					head=head.next;
					temp.next=null;
				}
			}
			else {
				Node temp = head;
				int i=0;
				for(;temp.next!=head &&i<pos-1;i++) {
					temp=temp.next;
				}
				if(i==pos-1) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.prev=null;
					temp.next=null;
				}
				else {
					System.out.println("Position not found");
				}
			}
		}
	}
	
	public void deleteByValue(int val){
		if(head == null) {
			System.out.println("list is empty");
		}
		else {
			Node tail = head.prev;
			if(head.data==val) {
				if(head==tail) {
					head =null;
				}
				else {
					head.next.prev = tail;
					tail.next=head.next;
					Node temp = head;
					head=head.next;
					temp.next=null;
				}
			}
			else {
				Node temp = head;
				int i=0;
				while(temp.next!=null &&temp.data!=val) {
					temp=temp.next;
				}
				if(temp.data==val) {
					temp.prev.next=temp.next;
					temp.next.prev=temp.prev;
					temp.prev=null;
					temp.next=null;
				}
				else {
					System.out.println("Value not found");
				}
			}
		}
	}
	
}
