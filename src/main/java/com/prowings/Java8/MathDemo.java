package com.prowings.Java8;

interface Maths
{
	public void addition(int a, int b);
}

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Maths m = (a,b) -> System.out.println("Addtion is "+ (a+b));
		
		m.addition(20, 40);
	}

}
