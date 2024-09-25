package com.prowings.Javapractise;

public class DownwardPyrimid {

	public static void main(String[] args) {
		pyramid(8);
	}

	public static void pyramid(int count) {
		int vcount = count;
		for (int i = 0; i <= count; i++) {
			for (int j = 1; j <= i * 2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= vcount; j++) {
				System.out.print(j + " ");
			}
			for (int j = vcount - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
			vcount--;
		}
	}
}
