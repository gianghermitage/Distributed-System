package com.hust.soict.giang.helper;

public class InsertionSort implements NumberSorter{

	@Override
	public void sort(int[] arr) {
		int n = arr.length;
		int key;
		int j;
		for(int i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j >= 0 && arr[j] > key) {
				arr [j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
}
