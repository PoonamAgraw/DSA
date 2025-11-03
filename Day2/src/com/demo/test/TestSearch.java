package com.demo.test;

import com.demo.service.Searching;

public class TestSearch {
	public static void main(String[] args) {
		int arr[] = { 7, 3, 9, 2, 34, 6 };
		int arr1[] = { 12, 13, 15, 17, 19, 20 };

		int pos = Searching.sequentialSearch(arr, 6);
		if (pos != -1) {
			System.out.println("Number Found At Position:" + pos);
		} else {
			System.out.println("Not Found");
		}

		pos = Searching.binarySearchNonRecursive(arr1, 19);
		if (pos != -1) {
			System.out.println("Number Found At Position:" + pos);
		} else {
			System.out.println("Not Found");
		}

		pos = Searching.binarySearchRecursive(arr1, 19, 0, 5);
		if (pos != -1) {
			System.out.println("Number Found At Position:" + pos);
		} else {
			System.out.println("Not Found");
		}

	}
}
