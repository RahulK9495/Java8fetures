package JavaPractise;

public class SingletonClass {
	
	private static SingletonClass t = null;
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		if(t==null)
		{
			t = new SingletonClass();
		}
		return t;
	}
}
