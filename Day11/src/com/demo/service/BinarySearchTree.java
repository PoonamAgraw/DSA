package com.demo.service;

public class BinarySearchTree {
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
	public BinarySearchTree() {
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
			System.out.println(root.data+",");
			inOrderTraversal(root.right);
		}
		
	}
	
	public void preOrder() {
		preOrderTraversal(root);
		System.out.println();
	}
	private void preOrderTraversal(Node root) {
		if(root!=null) {
			System.out.println(root.data+",");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
		
	}
	
	public void postOrder() {
		postOrderTraversal(root);
		System.out.println();
	}
	private void postOrderTraversal(Node root) {
		if(root!=null) {
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.println(root.data+",");
		}
		
	}
	
	public void deleteNode(int val) {
		root=deleteData(root,val);
	}
	private Node deleteData(Node root, int val) {
		if(root==null) {
			return root;
		}
		if(val<root.data) {
			root.left=deleteData(root.left,val);
		}else if(val>root.data) {
			root.right=deleteData(root.right,val);
		}else {
			if(root.left==null && root.right==null) {
				return null;
			}
			else if(root.left==null) {
				return root.right;
			}else if(root.right==null) {
				return root.left;
			}
			root.data=minvalue(root.right);
			root.right=deleteData(root.right,root.data);
		}
		return root;
	}
	private int minvalue(Node right) {
		int min = root.data;
		while(root.left!=null) {
			min=root.left.data;
			root=root.left;
		}
		return min;
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
	
	public boolean searchNonRecursive(int val) {
		return searchDataNonRecursive(root,val);
	}
	private boolean searchDataNonRecursive(Node root, int val) {
		if(root!=null) {
			Node temp=root;
			while(temp!=null) {
				if(temp.data==val) {
					System.out.println(val+" data found");
					return true;
				}
				else if(val<root.data) {
					return searchDataNonRecursive(root.left,val);
				}
				else {
					return searchDataNonRecursive(root.right,val);
				}
			}
			}
			
		System.out.println(val+" data not found");
		return false;
	}
}
