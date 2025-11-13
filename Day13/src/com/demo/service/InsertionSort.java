package com.demo.service;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSortAscending(char arr[]) {
		
				for(int i=1;i<arr.length;i++) {
					int count=0;
					int j=i-1;	
					char key=arr[i];	
					
					while(j>=0 && arr[j]>key) {
						arr[j+1]=arr[j];
						j--;
						count++;
					}	
					arr[j+1]=key;
					System.out.println(Arrays.toString(arr));
					System.out.println("Swap in insertion sort "+count);
				}
				
			}
			
	
		
 
}
