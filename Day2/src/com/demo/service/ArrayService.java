package com.demo.service;

import java.util.*;

public class ArrayService {
	private int[][] arr;

	public ArrayService() {
		arr = new int[3][3];
	}

	public ArrayService(int rows, int cols) {
		arr = new int[rows][cols];
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println("Enter Row " + i + " " + "Column" + " " + j);
				arr[i][j] = sc.nextInt();
			}
		}
	}

	public void displayData() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("------------------");
	}

	public int[] findSumRowWise() {
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				temp[i] += arr[i][j];
			}
		}
		return temp;
	}

	public int[] findSumColumnWise() {
		int[] temp = new int[arr[0].length];
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				temp[i] += arr[j][i];
			}
		}
		return temp;
	}

	public int[][] add2Array(ArrayService ob) {
		if (this.arr.length == ob.arr.length && this.arr[0].length == ob.arr[0].length) {
			int[][] temp = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					temp[i][j] = this.arr[i][j] + ob.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}

	public int[][] sub2Array(ArrayService ob) {
		if (this.arr.length == ob.arr.length && this.arr[0].length == ob.arr[0].length) {
			int[][] temp = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					temp[i][j] = this.arr[i][j] - ob.arr[i][j];
				}
			}
			return temp;
		}
		return null;
	}

	public void rowRotation(boolean flag, int num) {
		if (flag) {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = arr[0];
				for (int i = 0; i < arr.length - 1; i++) {
					arr[i] = arr[i + 1];
				}
				arr[arr.length - 1] = temp;
			}
		} else {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = arr[arr.length - 1];
				for (int i = arr.length - 1; i > 0; i--) {
					arr[i] = arr[i - 1];
				}
				arr[0] = temp;
			}
		}
	}

	public void columnRotation(boolean flag, int num) {
		if (flag) {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][arr[0].length - 1];
				}
				for (int i = 0; i < arr.length; i++) {
					for (int j = arr[0].length - 2; j >= 0; j--) {
						arr[i][j + 1] = arr[i][j];
					}
				}
				for (int i = 0; i < arr.length; i++) {
					arr[i][0] = temp[i];
				}

			}

		} else {
			for (int cnt = 0; cnt < num; cnt++) {
				int[] temp = new int[arr.length];
				for (int i = 0; i < arr.length; i++) {
					temp[i] = arr[i][0];
				}

				for (int i = 0; i < arr.length; i++) {
					for (int j = 1; j < arr[0].length; j++) {
						arr[i][j - 1] = arr[i][j];
					}
				}

				for (int i = 0; i < arr.length; i++) {
					arr[i][arr[0].length - 1] = temp[i];
				}
			}
		}

	}

	public int[][] transpose() {
		int[][] temp = new int[arr[0].length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				temp[j][i] = arr[i][j];
			}
		}
		return temp;
	}

	public boolean isSysmmetric() {
		if (arr.length == arr[0].length) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if (arr[i][j] != arr[j][i])
						return false;
				}
			}
			return true;
		}
		return false;
	}

	public boolean isIdentity() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j && arr[i][j] != 1) {
					return false;
				} else if (i != j && arr[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

	@Override
	public String toString() {
		return "ArrayService arr=" + Arrays.toString(arr);
	}

}
