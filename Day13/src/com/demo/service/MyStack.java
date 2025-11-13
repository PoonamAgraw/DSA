package com.demo.service;

public class MyStack {
	private char [] arr;
	private int top;
	public MyStack() {
		arr=new char[10];
		top=-1;
	}
	public MyStack(int size) {
		arr=new char [size];
		top=-1; 
	}
	public void push(char data) {
		if(!isFull()) {
			top++;
			arr[top]=data;
			System.out.println("pushed "+data);
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	private boolean isFull() {
		
		return top == arr.length-1;
	}
	public char pop() {
		if(!isEmpty()) {
			char data = arr[top];
			top--;
			return data;
		}
		else {
			System.out.println("Stack is Empty");
			return 0;
		}
	}
	   public void displayData() {
		   if (isEmpty()) {
	            System.out.println("Stack is Empty");
	            return;
	        }
	        System.out.print("Stack elements (top → bottom): ");
	        for (int i = top; i >= 0; i--) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	   }
	private boolean isEmpty() {
		
		return top==-1;
	}

}
