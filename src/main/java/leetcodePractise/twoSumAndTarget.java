package leetcodePractise;

public class twoSumAndTarget {
	
	public static int[] twoSum(int[] nums,int target)
	{
		int n = nums.length;
		for(int i=0; i<n-1; i++)
		{
			for(int j=i+1; j<n;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					return new int[] {i,j};
				}
			}
		}
		return new int[] {};
	}
	
	public static void main(String[] args) {
		
		int[] sample = {2,4,5,6,7};
		
		int[] arr = twoSum(sample,9);
		
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		
	}

}
