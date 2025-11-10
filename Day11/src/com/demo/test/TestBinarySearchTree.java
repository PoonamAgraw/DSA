package com.demo.test;
import com.demo.service.*;
public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree blist = new BinarySearchTree();
		blist.insertNode(45);
		blist.insertNode(52);
		blist.insertNode(15);
		blist.insertNode(19);
		blist.insertNode(2);
		blist.insertNode(95);
		blist.insertNode(44);
		blist.inOrder();
		System.out.println("----------");
		blist.postOrder();
		System.out.println("----------");
		blist.preOrder();
		System.out.println("----------");
		blist.deleteNode(19);
		blist.inOrder();
		System.out.println(blist.search(95));
		System.out.println(blist.searchNonRecursive(45));
	}

}
