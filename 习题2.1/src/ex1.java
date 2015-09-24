import java.util.Scanner;


public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a digree in Celsius:");
		double fahrenheit;
		Scanner input = new Scanner(System.in);
		
		double cersius = input.nextDouble();
		
		fahrenheit = (9.0 / 5) * cersius + 32;
		
		System.out.println(cersius + " cersius is " + fahrenheit + " fahrenheit");
		
	
	}

}
