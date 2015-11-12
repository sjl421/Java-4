

import java.util.*;

public class ex3 {

	public static int getNumber(char uppercaseLetter)
	{
		
		//如果字母小写，则转化为大写
		if(uppercaseLetter >= 'a' && uppercaseLetter <= 'z')
		{
			uppercaseLetter += 'A' - 'a';
		}
		//System.out.println(uppercaseLetter);
		
		int charA = 'A';
		int get = uppercaseLetter;
		
		int sub = get - charA;
		
		if(sub >= 0 && sub <= 2)
		{
			return 2;
		}
		else if(sub <= 5)
		{
			return 3;
		}
		else if(sub <= 8)
		{
			return 4;
				
		}else if(sub <= 11)
		{
			return 5;
				
		}else if(sub <= 14)
		{
			return 6;
				
		}else if(sub <= 18)
		{
			return 7;
				
		}else if(sub <= 21)
		{
			return 8;
				
		}
		else
		{
			return 9;		
		}

	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a String:");
		
		String str = input.next();
		
		char[] arr = str.toCharArray();
		
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i] >= 'a' && arr[i] <= 'z')
			{
				arr[i] = (char)(getNumber(arr[i]) + '0');
			}
			if(arr[i] >= 'A' && arr[i] <= 'Z')
			{
				arr[i] = (char)(getNumber(arr[i]) + '0');
			}
			
		}
		
		str = new String(arr);
		
		System.out.println(str);
		

		
	}

}
