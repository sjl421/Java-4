import java.util.Scanner;


public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Enter a number between 0 and 1000:");
		
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int sumdigit = 0;
		
		for(int digit = num % 10; digit > 0; num = num / 10 ,digit = num % 10)
		{
			sumdigit += digit;
		}
	
		System.out.println("The sum of digit is " + sumdigit);
	
	}

}
