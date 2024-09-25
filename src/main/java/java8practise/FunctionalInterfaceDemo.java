package java8practise;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		Finterface total = (a,b) ->(a*b);
		
		System.out.println(total.multiply(4, 6));
	}
}
