package com.demo.service;
public class OueueLinkedList {
	Node front;
	Node rear;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public OueueLinkedList() {
	front=null;
	rear=null;
	}
	public void enQueue(int val) {
		Node newNode=new Node(val);
		if(isEmpty()) {
			front=newNode;
		}else {
			rear.next=newNode;
		}
		rear=newNode;
		System.out.println("added num : "+val);
	}
	public int deQueue() {
		if(!isEmpty()) {
			Node temp = front;
			front = front.next;
			if(front == null) {
				rear=null;
			}
			temp.next=null;
			return temp.data;
		}
		else {
			System.out.println("Queue is Empty");
			return -1;
		}
	}
	private boolean isEmpty() {
		
		return front ==null && rear ==null;
	}
	
	

}
