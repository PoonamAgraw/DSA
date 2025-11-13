package com.demo.service;

public class DoublyLinkedList {
	Node head;

	class Node {
		int data;
		Node prev, next;

		public Node(int data) {
			this.data = data;
			prev = null;
			next = null;
		}

	}

	public DoublyLinkedList() {
		head = null;
	}

	public void addNode(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
	}

	public void displayData() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "---->");
			temp = temp.next;

		}
		System.out.println("null");
	}

	public void addByPosition(int pos, int val) {
		Node temp = head;
		Node newNode = new Node(val);
		if (pos == 1) {
			newNode.next = head;
			head.prev = newNode;
		} else {
			for (int i = 0; temp != null && i < pos - 2; i++) {
				temp = temp.next;
			}
			if (temp != null) {
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
				if (newNode.next != null) {
					newNode.next.prev = newNode;
				}
			} else {
				System.out.println("Position beyond limit");
			}
		}
	}

	public void deleteByVal(int val) {
		Node temp = head;
		if (head.data == val) {
			head.next.prev = null;
			head = temp.next;
			temp.next = null;
		} else {
			while (temp != null && temp.data != val) {
				temp = temp.next;
			}
			if (temp != null) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
					temp.next = null;
				}
				temp.prev = null;
			} else {
				System.out.println("Valuse not found");
			}
		}

	}

	public void addByValue(int val, int num) {
		Node temp = head;
		Node newNode = new Node(num);
		while (temp != null && temp.data != val) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Value " + val + " not found in the list");
			return;
		}
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next = newNode;

		if (newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}

	public void deleteByPosition(int pos) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		}

		Node temp = head;
		if (pos == 1) {
			head = temp.next;
			if (head != null) {
				head.prev = null;
			}
			temp.next = null;
			System.out.println("Node at position " + pos + " deleted");
			return;
		}
		for (int i = 1; temp != null && i < pos; i++) {
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Position " + pos + " not found");
			return;
		}
		if (temp.prev != null) {
			temp.prev.next = temp.next;
		}
		if (temp.next != null) {
			temp.next.prev = temp.prev;
		}
		temp.prev = null;
		temp.next = null;

		System.out.println("Node at position " + pos + " deleted");
	}

}
