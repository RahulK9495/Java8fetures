package JavaPractise;

public class Test {
	
	public static void main(String[] args) {
		
		SingletonClass s= SingletonClass.getInstance();
		
		SingletonClass d= SingletonClass.getInstance();
		
		System.out.println(s);
		System.out.println(d);
	}

}
