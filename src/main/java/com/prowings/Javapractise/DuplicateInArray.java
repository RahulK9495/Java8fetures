package com.prowings.Javapractise;

import java.util.Arrays;
import java.util.List;

public class DuplicateInArray {

	public static void main(String[] args) {

		int array[] = { 2, 3, 1, 2, 1, 4, 7, 8 ,8};

		
		int srt[] = sortArray(array);
		distinctArray(srt);
	}

	public static int[] distinctArray(int arr[]) {
		int n = arr.length;

		int temp[] = new int[n];

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];

		for (int i = 0; i < j; i++) {
			System.out.print(" " + temp[i]);
		}

		return temp;
	}

	public static int[] sortArray(int arr[]) {
		int length = arr.length;

		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int ele : arr) {
			System.out.print(" " + ele);
		}

		System.out.println("");
		return arr;

	}
	

}
