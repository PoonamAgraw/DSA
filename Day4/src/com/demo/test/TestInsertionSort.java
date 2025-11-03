package com.demo.test;

import com.demo.service.InsertionSort;

public class TestInsertionSort {
	public static void main(String[] args) {
		int arr []= {45,78,2,34,67,12,89};
		InsertionSort.insertionSortAscending(arr);
		InsertionSort.insertionSortDecending(arr);
	}

}
