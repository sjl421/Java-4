import java.util.ArrayList;
import java.util.Scanner;


public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner input = new Scanner(System.in);
		//ArrayList<Integer> num = new ArrayList<Integer>();

		Scanner input = new Scanner(System.in);

		ArrayList<Integer> num = new ArrayList<Integer>();
	
		String BookISBN = new String();
		
		String number = new String();
		while(true)
		{
		  number = input.next();
		  
		  if(number.length()==9)
			  break;
		  System.out.println("输入错误，请重新输入");
		}
		
		//计算第十位数
		int num10 = 0;
		for(int i = 0;i < 9;i++)
		{
			num10 += Integer.parseInt(String.valueOf(number.charAt(i))) * (i+1);
			//System.out.println(String.valueOf(number.charAt(i)));
		}
		num10 = num10 % 11;
		//System.out.println(num10);
		
		BookISBN = number + String.valueOf(num10);
		
		System.out.println(BookISBN);

	}

}
