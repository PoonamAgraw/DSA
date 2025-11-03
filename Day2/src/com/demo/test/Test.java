package com.demo.test;

import java.util.stream.IntStream;

import com.demo.service.*;

public class Test {

	public static void main(String[] args) {
		ArrayService ob = new ArrayService();
		System.out.println("Enter array Elements:");
		ob.acceptData();
		ob.displayData();
		int[] temp = ob.findSumRowWise();
		System.out.println("Addition Row Wise:");
		IntStream.of(temp).forEach(e -> System.out.print(e + ","));
		System.out.println("");
		temp = ob.findSumColumnWise();
		System.out.println("Addition Column Wise:");
		IntStream.of(temp).forEach(e -> System.out.print(e + ","));
		System.out.println();
		ob.rowRotation(false, 1);
		ob.displayData();
		System.out.println();
		ob.columnRotation(false, 1);
		ob.displayData();
		int[][] arr=ob.transpose();
		displayarray1(arr);
		if(ob.isSysmmetric()) {
			System.out.println("symmetric matrix");
		}else {
			System.out.println("not symmetric matrix");
		}
		
		if(ob.isIdentity()) {
			System.out.println("Identity matrix");
		}else {
			System.out.println("not Identity matrix");}
		}
		
		private static void displayarray1(int[][] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[0].length;j++) {
					System.out.print(arr[i][j]+"\t");
				}
				System.out.println();
			}
		
	}

}
