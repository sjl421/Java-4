import java.util.Scanner;


public class ex1 {

	public static int count(String str,char a)
	{
			
		char[] charArr = str.toCharArray();
		for (int i = 0;i < charArr.length;i++)
		{
			if(charArr[i] == a)
			{
				return i + 1;
			}
			
		}
		return 0;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		String str = input.next();
		
		String temp = input.next();
		char ch = temp.charAt(0);
		
		
		System.out.println(count(str,ch));;
		
		

	}

}
