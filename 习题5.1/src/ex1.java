import java.util.*;


public class ex1 {

	public static int[] eliminateDuplicates(int[] numbers)
    {
		int[] arr = numbers.clone();
		for(int i = 0;i < arr.length;i++)
		{
			for(int j = i;j < arr.length - 1;j++)
			{
				if(arr[i] == arr[j+1])
				{
					int temp = j;
					for(;temp < arr.length -2;temp++)
					{
						arr[temp +1] = arr[temp+2];
						arr[temp+2] = '\0';
					}
	
				}
			}
			
		}
		
		int length = 0;
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] != '\0')
			{
				length++;
			}
		}
	
		int[] newarr = new int[length];
		
		for(int i = 0;i < newarr.length;i++)
		{
			newarr[i] = arr[i];
		}

		return newarr;
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
			System.out.print(newarr[i] + " ");
		}
		
	}

}
