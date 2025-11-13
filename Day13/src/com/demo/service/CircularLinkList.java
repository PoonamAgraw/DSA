package com.demo.service;


public class CircularLinkList {
	Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next=null;
		}
	}
	public CircularLinkList() {
		head=null;
	}
	public void addNode(int val) {
		Node newNode=new Node(val);
		if(head==null) {
			head=newNode;
		}else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			temp.next=newNode;
			
		}
		newNode.next=head;
	}
	
	public void displayData() {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			do{
			   System.out.print(temp.data+"--->");
			   temp=temp.next;
			}while(temp!=head);
		}
		System.out.println("head");
		
	}
	
	
	public void addByPosition(int pos,int num) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
		Node newNode=new Node(num);
		if(pos==1) {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
			}
			newNode.next=head;
			head=newNode;
			temp.next=head;
			
		}else {
			Node temp=head;
			int i=1;
			for(;temp.next!=head && i<=pos-2;i++) {
				temp=temp.next;
			}
			if(i>pos-2) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println(" position  is beyond limit");
			}
		}
		}
	}
	public void addByValue(int val) {
		Node newNode=new Node(val);
		if(head.data==val) {
			newNode.next=head.next;
			head.next=newNode;
		}else {
		    Node temp=head;
			do {
				temp=temp.next;
			}while(temp!=head && temp.data!=val);
			if(temp!=head) {
				newNode.next=temp.next;
				temp.next=newNode;
			}else {
				System.out.println(" not found");
			}
		}
	}
	public void deleteByposition(int pos) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(pos==1) {
				Node tail=head;
				while(tail.next!=head) {
					tail=tail.next;
			    }
				if(tail==head) {
					head=null;
				}else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(i==pos-1) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println("position not found");
				}
				
				
			}
		}
	}
	public void deleteByValue(int val) {
		if(head==null) {
			System.out.println("list is empty");
		}else {
			Node temp=head;
			if(head.data==val) {
				Node tail=head;
				while(tail.next!=head) {
					tail=tail.next;
			    }
				if(tail==head) {
					head=null;
				}else {
					head=head.next;
					temp.next=null;
					tail.next=head;
				}
			}else {
				Node prev=null;
				int i=0;
				for(;temp.next!=head && temp.data!=val;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(" not found");
				}
				
				
			}
		}
	}
}


