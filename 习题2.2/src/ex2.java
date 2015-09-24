import java.util.Scanner;


public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte codeNumber;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a ASCLL code:");
		
		codeNumber = input.nextByte();
		
		System.out.printf("The character for ASCLL code is %c", codeNumber);
		
		

	}

}
