package com.demo.service;

public class SinglyLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
		
	}
	public SinglyLinkedList() {
		head = null;
	}
	public void addNode(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = newNode;
		}
	}
	public void displayNode() {
		if(head==null) {
			System.out.println("Empty.");
		}
		else {
			for(Node temp = head;temp!=null;temp=temp.next) {
				System.out.print(temp.data+"-->");
			}
			System.out.print("null");		
		}
	}
	public void addByPosition(int pos,int value) {
		Node newNode = new Node(value);
		if(pos ==1) {
			newNode.next = head;
			head = newNode;
		}
		else {
			Node temp = head;
			for(int i=1;temp!=null && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
			}
			else {
				System.out.println("Given position "+pos+"  is beyond the length of the list");
			}
		}
	}
	
	public void addByNum(int pos,int num) {
		Node newNode=new Node(num);
		Node temp=head;
		while(temp!=null && temp.data!=num) {
			temp=temp.next;
		}
		if(temp!=null) {
			newNode.next=temp.next;
			temp.next=newNode;
			
		}else {
			System.out.println(num+"Not Found");
		}
	}
	
	
	public  void deleteByValue(int num) {
		Node temp = head;
		Node prev = null;
		if(head.data == num) {
			head = temp.next;
			temp.next=null;
		}
		else {
			
			while (temp!=null && temp.data != (num)) {
				prev = temp ;
				temp = temp.next;
			}
		}
		if(temp!=null) {
			prev.next = temp.next;
			temp.next = null;			
		}
		else {
			System.out.println("Data not found.");
		}
	}
	
	public void deleteByPos(int pos){
		Node temp = head;
		Node prev = null;
		if(pos ==1) {
			head = temp.next;
			temp.next = null;
		}
		else {
			for(int i = 0; temp!=null && i<pos-1;i++) {
				prev = temp;
				temp = temp.next;
			}
				if(temp!=null) {
					prev.next = temp.next;
					temp.next=null;
				}
				else {
					System.out.println("Position not found");
				}
				
			}
		}
	}
	
	


