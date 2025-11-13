package com.demo.service;

public class StackLinkesdList {
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
		
	}
	public StackLinkesdList() {
		top=null;
	}
	
	public boolean isEmpty() {
		return top==null;
	}
	
	public void push(int num) {
		Node newNode=new Node(num);
		  if(!isEmpty()) {
			newNode.next=top;
		  }
		  top=newNode;
		  System.out.println("pushed : "+num);
		}
	

    public int pop() {
    	if(!isEmpty()) {
    		Node temp=top;
    		top=top.next;
    		temp.next=null;
    		return temp.data;
    	}else {
    		System.out.println("Stack is empty");
    		return -1;
    	}	
    }
    
    public void displayData() {
    	if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements (top → bottom): ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
