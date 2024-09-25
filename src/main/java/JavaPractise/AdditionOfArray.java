package JavaPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AdditionOfArray {
	
	public static int[] twoSum (int[] nums, int target)
	{
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int i=0; i<nums.length; i++)
		{
			int req = target -nums[i];
			if(map.containsKey(req))
			{
				int arr[] = {map.get(req),i};
				return arr;
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static ArrayList<int[]> sumofnumbers (int [] nums, int target)
	{
		ArrayList<int[]> list = new ArrayList<int[]>();
		
		for(int i=0; i<nums.length; i++ )
		{
			for(int j=i+1; j<nums.length; j++)
			{
				if(nums[i]+nums[j]==target)
				{
					list.add(new int[] {nums[i],nums[j]});
				}
			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		int[] sample = {2,3,5,2,6,7};
		
		int[] result =twoSum(sample, 7);
		
		Arrays.asList(result).stream().forEach(x-> System.out.println(x));
		
		ArrayList<int[]> flist = sumofnumbers(sample,7);
	//	flist.stream().forEach(System.out::println);
//		System.out.println(Arrays.toString(flist));
		
		for(int[]num :flist)
		{
			System.out.println(num[0]+"   "+num[1]);
		}
		
		for(int a : result)
		{
	//		System.out.println(a);
		}
	}
}
