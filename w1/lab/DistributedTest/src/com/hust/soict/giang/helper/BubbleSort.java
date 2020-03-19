package com.hust.soict.giang.helper;

public class BubbleSort implements NumberSorter {

	@Override
	public void sort(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
	}

}
