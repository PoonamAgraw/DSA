 package com.demo.service;

import java.util.Arrays;

public class QuickSort {

	public static int partition(int[] arr, int start, int end) {
		int pivot = start;
		int i = start;
		int j = end;
		while(i<j) {
			while(i<end && arr[i]<=arr[pivot]) {
				i++;
			}
			while(j>end && arr[j]>arr[pivot]) {
				j++;
			}
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]= temp;
			}
		}
		if(pivot!=j) {
			int temp = arr[pivot];
			arr[pivot]=arr[j];
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
		return j;
	}
	public static void quicksort(int[] arr,int start,int end) {
		if(start<end) {   
			int p=partition(arr,start,end);
			quicksort(arr,start,p-1);
			quicksort(arr,p+1,end);
			
		}
	}


}
