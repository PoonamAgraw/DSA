package com.demo.service;

public class StackLinkesdList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			this.next=null;
		}
	}
	public StackLinkesdList() {
		top=null;
	}
    public void push(int num) {
    	Node newNode = new Node(num) ;
    		if(!isEmpty()) {
    			top=newNode;
    			System.out.println("pushed "+num);
    		}
    		else {
    			newNode.next=top;
    			top=newNode;
    		}
    }
	private boolean isEmpty() {
		
		return top==null;
	}
    public int pop() {
    	if(!isEmpty()) {
    		int num=top.data;
    		Node temp=top;
    		top=top.next;
    		temp.next=null;
    		return num;
    	}
    	else {
    		System.out.println("Stack is empty");
    		return -1;
    	}
    }
}
