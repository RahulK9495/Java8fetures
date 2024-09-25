package com.prowings.Java8;

interface functional{

public void smsg();

}
public class functionalInterfaceDemo1 {

	
	public static void main(String[] args) {
		
		functional f = () -> System.out.println("This is show method  ");
		
		f.smsg();
		
	}		
}
