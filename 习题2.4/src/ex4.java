import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {

	static char StudentGrade(int score ,int bestScore)
	{
		if(score >= (bestScore - 10))
		{
			return 'A';
		}
		else if(score >= (bestScore - 20))
		{
			return 'B';
		}
		else if(score >= (bestScore - 30))
		{
			return 'C';
		}
		else if(score >= (bestScore - 40))
		{
			return 'D';
		}
		else
		{
			return 'E';
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Enter the number of the students:");
		
		Scanner input = new Scanner(System.in);
		int studentNumber = input.nextInt();
		int bestScore = 0;
		ArrayList<Integer> scores = new ArrayList<Integer>();
		System.out.printf("Enter " + studentNumber +" scores: ");
		
		for(int i = 0;i < studentNumber;i++)
		{
			int score = input.nextInt();
			scores.add(score);
			if(score > bestScore)
			{
				bestScore = score;
			}
		}
		
		for(int i = 0 ;i < studentNumber; i++)
		{
			System.out.println( "Student " + i + " score is " + scores.get(i) + " and grade is " + StudentGrade(scores.get(i),bestScore));
		}

	}

}
