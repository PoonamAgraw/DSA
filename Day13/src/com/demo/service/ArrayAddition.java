package com.demo.service;
import java.util.*;
public class ArrayAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many elements you want:");
		int n ;
		n=sc.nextInt();
		int [] arr = new int[n];
		int [] arr1= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr1[i]=0;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					continue;
				}
				arr1[i]=arr1[i]+arr[j];
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr1[i]+"\t");
		}

	}

}
