import java.util.*;


public class ex2 {

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
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the integers between 1 and 100:");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[100];
		int num = input.nextInt();
		int index = 0;
		while(num != 0)
		{
			arr[index++]  = num;
			num = input.nextInt();
		}
	
		sort(arr);
		
		int times = 1;
		int oldnum;
		
		for(int i = 0;i < arr.length ;i++)
		{
			
			System.out.println(arr[i]);
		}
		
		for(int i = 0;i < arr.length - 1 ;i++)
		{
			

			if(arr[i] == 0)
			{
				continue;
			}
			
			if(arr[i] == arr[i+1])
			{
				times ++;	
			}
			else
			{
				System.out.println(arr[i] + " occurs " + times + " times");
				times = 1;
	
			}

			if(i == arr.length -2)
			{
				if(arr[i] == arr[i+1])
				{
					System.out.println(arr[i] + " occurs " + times + " times");
				}
				else
				{
					System.out.println(arr[i+1] + " occurs " + times + " times");
				}
			}

		}
		
		
		
		
	}

}
