package com.prowings.Javapractise;

public class SwappingCharsInString {

	public static void main(String[] args) {

		System.out.println(swappingOfString("RahulKhot"));

	}

	public static String swappingOfString(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		char[] cstr = str.toCharArray();

		for (int i = 0; i < str.length() - 1; i += 2) {
			char temp = cstr[i];
			cstr[i] = cstr[i + 1];
			cstr[i + 1] = temp;
		}

		return new String(cstr);
	}

}
