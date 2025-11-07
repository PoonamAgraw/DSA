package com.demo.service;

public class StackArray {
	private int [] arr;
	private int top;
	public StackArray() {
		arr=new int[10];
		top=-1;
	}
	public StackArray(int size) {
		arr=new int [size];
		top=-1; 
	}
	public void push(int num) {
		if(!isFull()) {
			top++;
			arr[top]=num;
			System.out.println("pushed "+num);
		}
		else {
			System.out.println("Stack is Full");
		}
	}
	private boolean isFull() {
		
		return top == arr.length-1;
	}
	public int pop() {
		if(!isEmpty()) {
			int num = arr[top];
			top--;
			return num;
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	private boolean isEmpty() {
		
		return top==-1;
	}

}
