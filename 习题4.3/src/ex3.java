import java.util.Scanner;


public class ex3 {

	static String hNum = "";
	static String convet(int num)
	{
		if(num >= 0 && num <= 9)
		{
			return String.valueOf((char)('0' + num));
		
		}
		else if(num >= 10)
		{
			return String.valueOf((char)('A' + num - 10));
		}
		else
		 return null;
		
	}
	static String Hexadecimals(int num)
	{
		
		if(num != 0)
		{
			Hexadecimals(num/16);
		}
		
		if(num == 0)
			return null;
		
		return	hNum += convet(num % 16);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println( Hexadecimals(123));
		
		input.close();

	}

}
