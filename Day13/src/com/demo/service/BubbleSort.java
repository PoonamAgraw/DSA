package com.demo.service;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int count = 0;
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					count++;
				}
				
			}
			System.out.println("Number of swap in "+i+" is:"+count);
			System.out.println(Arrays.toString(arr));
		}
}
}
