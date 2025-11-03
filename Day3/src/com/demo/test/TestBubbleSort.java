package com.demo.test;
import java.util.stream.IntStream;

import com.demo.service.*;
public class TestBubbleSort {
	public static void main(String[] args) {
		int arr []= {23,56,1,45,90,87,2};
		BubbleSort.bubbleSort(arr);
		BubbleSort.bubbleSortImproved(arr);
		BubbleSort.bubbleSortImprovedDescending(arr);
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}

}
