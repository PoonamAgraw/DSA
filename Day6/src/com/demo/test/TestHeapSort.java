package com.demo.test;

import java.util.stream.IntStream;

import com.demo.service.HeapSort;

public class TestHeapSort {
	public static void main(String[] args) {
		int [] arr = {3,7,5,10,9,8,4};
		HeapSort.heapSort(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}

}
