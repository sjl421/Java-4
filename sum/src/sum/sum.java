package sum;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("请输入n");
		
		int n = input.nextInt();
		float sum = 0;
		
		float num = 0;
		
		for(int i = 0;i < n + 1 ;i++)
		{
			if( i == 0 )
				num = 1;
			else
				num = (float)i / (i + 1);
			
			sum += num;
		}
		System.out.println(sum);
		
	}

}
