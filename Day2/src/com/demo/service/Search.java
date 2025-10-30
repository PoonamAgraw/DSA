package com.demo.service;

public class Search {
	public static int sequentialSearch(int arr[], int val) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				return i;
			}
		}
		return -1;

	}

	public static int binarySearchNonRecursive(int arr[], int search) {
		int low = 0;
		int high = arr.length - 1;
		while (low != high) {
			int mid = (low + high) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (arr[mid] == search) {
					return mid;
				} else if (search < arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			}
		}
		return -1;

	}

	public static int binarySearchRecursive(int arr[], int search, int low, int high) {
		if (low != high) {
			int mid = (low + high) / 2;
			if (arr[mid] == search) {
				return mid;
			} else if (arr[mid] < search) {
				return binarySearchRecursive(arr, search, mid + 1, high);

			} else {
				return binarySearchRecursive(arr, search, low, mid - 1);
			}

		}
		return -1;

	}

}
