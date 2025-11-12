package com.demo.test;
import com.demo.service.*;
import java.util.*;
public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree blist = new BinaryTree();
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want");
		int n;
		n=sc.nextInt();
		int [] arr =new int[n];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			blist.insertNode(num);
		}
		System.out.println("Inorder List is:");
		blist.inOrder();
		System.out.println("Enter a num which you want to search:");
		int num=sc.nextInt();
		blist.search(num);
	}

}
