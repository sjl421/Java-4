import java.util.*;


public class ex1 {

	public static void sort(char[] ch)
	{
		for(int i = 0;i < ch.length;i++)
		{
			for(int j = i;j < ch.length;j++)
			{
				if(ch[i] > ch[j])
				{
					char temp;
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
	
				}
			}
		
		}
	}
	
	
	
	public static boolean isAnagram(String s1,String s2)
	{
		if(s1.length() != s2.length())
			return false;
		
		
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		
		sort(arr1);
		sort(arr2);
		
		for(int i = 0;i < arr1.length;i++)
		{
			if(arr1[i] != arr2[i])
			{
				System.out.println(arr1[i] + "   " + arr2[i]);
				return false;
			}	
		}

		return true;
	}
	

	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Please enter two String:");
		
		String str1 = input.next();
		String str2 = input.next();
		
		System.out.println(isAnagram(str1, str2) ? "anagram" : "not anagram" );
		
		
		
		
		input.close();
	}
	
	
}
