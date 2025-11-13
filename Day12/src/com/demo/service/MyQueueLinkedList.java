package com.demo.service;

public class MyQueueLinkedList {
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
	public MyQueueLinkedList() {
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		return front==null && rear==null;
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
			Node temp=front;
			front=front.next;
			if(front==null) {
				rear=null;
			}
			temp.next=null;
			return temp.data;
		}else {
			System.out.println("Queue is empty");
			return -1;
		}
	}
	
	public void displayData() {
		  if (isEmpty()) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        Node temp = front;
	        System.out.print("Queue elements (front → rear): ");
	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }
	        System.out.println("null");
	}

}
