package com.demo.service;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data=data;
			left=null;
			right =null;
		}
	}
	public BinaryTree() {
		root =null;
	}
	public void insertNode(int val) {
		root=insertData(root,val);
	}
	private Node insertData(Node root, int val) {
		Node newNode=new Node(val);
		if(root==null) {
			root=newNode;
			return root;
		}
		else if(val<root.data) {
			root.left=insertData(root.left,val);
		}
		else {
			root.right=insertData(root.right,val);
		}
		return root;
	}
	
	public void inOrder() {
		inOrderTraversal(root);
		System.out.println();
	}
	private void inOrderTraversal(Node root) {
		if(root!=null) {
			inOrderTraversal(root.left);
			System.out.print(root.data+",");
			inOrderTraversal(root.right);
		}
		
	}
	
	
	
	public boolean search(int val) {
		return searchData(root,val);
	}
	private boolean searchData(Node root, int val) {
		if(root!=null) {
			if(root.data==val) {
				System.out.println(val+" data found");
				return true;
			}
			else if(val<root.data) {
				return searchData(root.left,val);
			}
			else {
				return searchData(root.right,val);
			}
		}
		System.out.println(val+" data not found");
		return false;
	}
	
	
}
