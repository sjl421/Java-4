
import java.util.Random;
import java.util.Scanner;


public class ex1 {



	static void GameResult(int computer,int user)
	{
	
		if(computer == 0 && user == 1)
		{
			System.out.println("The computer is scissor,you are rock,you win");
		}
		else if(computer == 1 && user == 2)
		{
			System.out.println("The computer is rock,you are papper,you win");
		}
		else if(computer == 2 && user == 0)
		{
			System.out.println("The computer is papper,you are scissor,you win");
		}
		else if(computer == 2 && user == 1)
		{
			System.out.println("The computer is papper,you are rock,you fail");
		}
		else if(computer == 1 && user == 0)
		{
			System.out.println("The computer is rock,you are scissor,you fail");
		}
		else if(computer == 0 && user == 2)
		{
			System.out.println("The computer is scissor,you are papper,you fail");
		}
		else if (computer == user && user == 0)
		{
			System.out.println("The computer is scissor,you are scissor too,it is a draw");
		}
		else if (computer == user && user == 1)
		{
			System.out.println("The computer is Rock,you are rock too,it is a draw");
		}
		else
		{
			System.out.println("The computer is paper,you are paper too,it is a draw");
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rad = new Random();
		Scanner input =  new Scanner(System.in);
		
		
		System.out.println("scissor(0),rock(1),parer(2)");
		int userInput;

		//随机出0，1，2三个数
		while(true)
		{
			userInput = input.nextInt();
		    GameResult(rad.nextInt(3), userInput);
		}

	}

}
