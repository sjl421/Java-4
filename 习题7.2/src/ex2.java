import java.util.Scanner;


public class ex2 {

	
	static boolean isPassword(String str)
	{
		//1>判断长度
		if(str.length() < 8)
		{
			return false;
		}
		
		int numberCount = 0;
		for(int i = 0;i < str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9')
			{
				numberCount ++;
			}
			
			if(!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')))
			{
				return false;
			}
	
		}
		if(numberCount < 2) return false;
		
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please Enter you password!");
		
		String pw = input.next();
		if(isPassword(pw))
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}

}
