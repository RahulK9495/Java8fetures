package com.prowings.Javapractise;

public class ReverseString {

	public static void main(String[] args) {

		String str = "My name is Rahul";

		int n = str.length();

		String reverseString = "";

		for (int i = n - 1; i >= 0; i--) {
			reverseString = reverseString + str.charAt(i);
		}

		System.out.println(reverseString);

		StringBuffer sb = new StringBuffer(str);

		StringBuffer revsb = sb.reverse();

		System.out.println(revsb);

	}

}
