package com.prowings.Javapractise;

public class sortElementsInArray {

	public static void main(String[] args) {

		int array[] = { 2, 4, 5, 9, -1, -3, 2 };

		int length = array.length;

		int temp = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int ele : array) {
			System.out.print(ele + " ");
		}

	}

}
