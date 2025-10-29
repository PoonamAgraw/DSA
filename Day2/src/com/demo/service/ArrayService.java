package com.demo.service;
import java.util.*;
public class ArrayService {
private int [][] arr;

public ArrayService() {
	arr = new int [3][3];
}
public ArrayService(int rows,int cols) {
	arr = new int [rows][cols];
}
public void acceptData() {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++){
			arr[i][j]=sc.nextInt();
		}
	}
}
public void displayData() {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++){
			System.out.println(arr[i][j]+"\t");
		}
		System.out.println();
	}
}

public int [] findSumRowWise() {
	int [] temp =new int[arr.length];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[0].length;j++) {
			temp[i]+=arr[i][j];
		}
	}
	return temp;
}

public int [] findSumColumnWise() {
	int [] temp =new int[arr[0].length];
	for(int i=0;i<arr[0].length;i++) {
		for(int j=0;j<arr.length;j++) {
			temp[i]+=arr[j][i];
		}
	}
	return temp;
}












@Override
public String toString() {
	return "ArrayService arr=" + Arrays.toString(arr) ;
}

}
