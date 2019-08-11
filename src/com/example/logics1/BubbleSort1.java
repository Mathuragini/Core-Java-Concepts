package com.example.logics1;

public class BubbleSort1 {

	public void sorting(int arr[]) {
		int size = arr.length;

		for (int i = 0; i < size - 1; i++)
			for (int j = 0; j < size - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

	}

	public static void main(String[] args) {
 
		BubbleSort1 bubbleSort = new BubbleSort1();
		int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
		bubbleSort.sorting(arr);
		
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
