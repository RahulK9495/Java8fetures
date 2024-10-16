package JavaPractise;

@FunctionalInterface
public interface functionalInterface {
	
	public abstract void add(int a, int b);
	
	default void addition(int a, int b)
	{
		System.out.println("Addition");
	}

}
