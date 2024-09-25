package com.prowings.Java8;

interface math2
{
	public int square(int a);
}
public class SquareDemo {
	
	public static void main(String[] args) {
		
		math2 m = (n) -> n*n;
		
		int ans=m.square(23);
		System.out.println(ans);
	}

}
