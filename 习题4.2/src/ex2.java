


public class ex2 {

	static int numbers = 0;
	static void getFibonacci(int num1,int num2)
	{
		

		System.out.println(num1);
		numbers--;
		if(numbers <= 0)
			return;
		System.out.println(num2);
		numbers--;
		num1 = num1 + num2;
		num2 = num1 + num2;
		while(numbers > 0)
		{
			getFibonacci(num1,num2);
		}
	}
	
	
	static void fibonacci(int n)
	{
		numbers = n;
		getFibonacci(0,1);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		fibonacci(20);
		
	}

}
