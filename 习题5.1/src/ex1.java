import java.util.*;


public class ex1 {

	public static int[] eliminateDuplicates(int[] numbers)
    {
		int[] newArr= new int[sortAndReturnLength(numbers)];
		
		    int j = 0;

			for(int i = 0;i < 9;i++)
			{
				if(numbers[i] != numbers[i+1])
				{
					newArr[j++] = numbers[i];
				}
			}
			if(numbers[8] != numbers[9])
			{
				newArr[j] = numbers[9];
			}

		return newArr;

    }
	
	public static int sortAndReturnLength(int[] nums)
	{
		for(int i = 0;i < 10;i++)
		{
			for(int j = i;j < 10;j++)
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
		
		int length = 0;
		for(int i = 0;i < 9;i++)
		{
			if(nums[i] != nums[i+1])
			{
				length++;
			}
			
		}
		if(nums[8] != nums[9])
		{
			length++;
		}
		return length;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int[] arr = new int[10];
		
		System.out.println("Enter ten numbers:");
		
		for(int i = 0;i < 10;i++)
		{
			arr[i] = input.nextInt();
		}

	
		
		
		int[] newarr = eliminateDuplicates(arr);
		
		for(int i = 0;i < newarr.length;i++)
		{
			System.out.println(newarr[i]);
			
		}
		
		
	}

}
