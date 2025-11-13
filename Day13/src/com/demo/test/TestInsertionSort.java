package com.demo.test;
import java.util.*;
import com.demo.service.InsertionSort;

public class TestInsertionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("First add some characters...");
	      char[] arr = sc.next().toCharArray();
	
		InsertionSort.insertionSortAscending(arr);
		
	}

}
