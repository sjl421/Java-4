import java.util.*;


public class ex3 {

	public static void sort(int[] nums)
	{
		for(int i = 0;i < nums.length;i++)
		{
			for(int j = i;j < nums.length;j++)
			{
				if(nums[i] > nums[j])
				{
					int temp;
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
	
				}
			}
		
		}
		
	}
	public static boolean equal(int[] list1, int[] list2)
	{
		if(list1.length != list2.length)
			return false;
		
		sort(list1);
		sort(list2);
		
		
		for(int i = 0; i < list1.length;i++)
		{
			if(list1[i] != list2[i])
			{
				return false;
			}
		}

		return true;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
				
		System.out.println("Enter List1:");
		int length = input.nextInt();
		
		int[] list1 = new int[length];
		
		for(int i = 0;i < length;i++)
		{
			list1[i] = input.nextInt();
		}
		
		System.out.println("Enter List2:");
		length = input.nextInt();
		int[] list2 = new int[length];
		for(int i = 0;i < length;i++)
		{
			list2[i] = input.nextInt();
		}
		
		if(equal(list1, list2))
		{
			System.out.println("Tow list are identical");
		}
		else
		{
			System.out.println("Tow list are not identical");
		}
		
	
	}


	
	
	
}
