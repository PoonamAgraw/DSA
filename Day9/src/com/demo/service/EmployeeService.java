package com.demo.service;

import com.demo.beans.Employee;


public class EmployeeService {
       Node head;
       class Node{
    	   Employee data;
    	   Node next;
		public Node(Employee data) {
			this.data = data;
			this.next=null;
		}
    	   
       }
	public EmployeeService() {
		this.head =null;
	}
    
		public void addAfterNum(Employee  ob,int empnum) {
			Node newNode=new Node(ob);
			Node temp=head;
			while(temp!=null && temp.data.getEmpid()!=empnum) {
				temp=temp.next;
			}
			if(temp!=null) {
				newNode.next=temp.next;
				temp.next=newNode;
				
			}else {
				System.out.println(empnum+"Not Found");
			}
			
		}

		public void addByPosition(int pos,Employee ob) {
			Node newNode=new Node(ob);
			if(pos==1) {
				newNode.next=head;
				head=newNode;
			}else {
				Node temp=head;
				for(int i=1;temp!=null && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(temp!=null) {
					newNode.next=temp.next;
					temp.next=newNode;
				}else {
					System.out.println("Given position "+pos+"  is beyond the length of the list");
				}
			}
		}
		public void addNode(Employee ob) {
			Node newNode=new Node(ob);
			if(head==null) {
				head=newNode;
			}else {
				Node temp=head;
				while(temp.next!=null) {
					temp=temp.next;
				}
				temp.next=newNode;
				
			}
		}
		
		public void displayData() {
			if(head==null) {
				System.out.println("List is empty");
			}else {
				for(Node temp=head;temp!=null;temp=temp.next) {
					System.out.print(temp.data+"--->");
				}
				System.out.println("null");
			}
		}
		
		public void deleteByValue(int empno) {
			Node temp=head;
			if(head.data.getEmpid()==empno) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				while(temp!=null && temp.data.getEmpid()!=empno) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(empno + " not found");
				}
			}
		}
		
		public void modifysalById(int empno,double newsal) {
			Node temp=head;
			while(temp!=null && temp.data.getEmpid()!=empno) {
				temp=temp.next;
			}
			if(temp!=null) {
				temp.data.setSal(newsal);
				System.out.println("salary updated");
			}else{
				System.out.println(empno + " not found");
			}
		}
		
		

		public void deleteByPosition(int pos) {
			Node temp=head;
			if(pos==1) {
				head=temp.next;
				temp.next=null;
			}else {
				Node prev=null;
				for(int i=0;temp!=null && i<pos-1;i++) {
					prev=temp;
					temp=temp.next;
				}
				if(temp!=null) {
					prev.next=temp.next;
					temp.next=null;
				}else {
					System.out.println(pos+ " is beyond the limit");
				}
			}
		}
}
