package leetcodePractise;

public class CheckParanthesis {
	
	public static void main(String[] args) {
		
		
		String str = "(){}[]";
		
		System.out.println(isValidParanthesis(str));
		
		
		
	}
	
	public static boolean isValidParanthesis(String s)
	{
	
			if (s.contains("()"))
			{
				s.replace("()", "");
			}else if(s.contains("{}"))
			{
				s.replace("{}", "");
			}else if (s.contains("[]"))
			{
				s.replace("[]", "");
			}
		
			return s.isEmpty();
		

		
	}

}
