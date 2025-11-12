package com.demo.test;
import com.demo.service.*;
import java.util.stream.IntStream;

public class TestBubbleSort {
	public static void main(String[] args) {
		int arr []= {23,56,1,45,90,87,2};
		BubbleSort.bubbleSort(arr);
		System.out.println();
		System.out.println();
		System.out.println("Bubble Sort Array is:");
		IntStream.of(arr).forEach(e->System.out.print(e+"\t"));
	}
}
