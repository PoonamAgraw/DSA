package com.demo.service;
public class SinglyLinkList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	public SinglyLinkList() {
		head=null;
	}
	public void  addNode(int num) {
		Node newNode = new Node(num);
		if(head==null) {
			head=newNode;
		}
		else {
			Node temp=head;
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next = newNode;
		}
	}
	public void displayData() {
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
	
}
