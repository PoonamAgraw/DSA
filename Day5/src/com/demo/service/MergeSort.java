package com.demo.service;

public class MergeSort {
public static void mergeSort(int [] arr, int start,int mid,int end) {
	int n1 = mid-start-1;
	int n2 = end-mid;
	int [] leftarray = new int[n1];
	int [] rigtharray = new int[n2];
	for(int i=0;i<n1;i++) {
		leftarray[i] = arr[start+i];
	}
	for(int i=0;i<n2;i++) {
		rigtharray[i] = arr[mid+1+i];
	}
	int i=0,j=0,k=start;
	while(i<n1 && j<n2) {
		if(leftarray[i] < rigtharray[i]) {
			arr[k] = leftarray[i];
			i++;
			k++;
		}
		else {
			arr[k] = rigtharray[j];
			j++;
			k++;
		}
	}
}
}
