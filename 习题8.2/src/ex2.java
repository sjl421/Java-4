
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		//string[] strs = args.sp
		for(int i = 0; i < args.length;i++)
		{
			sum += Integer.parseInt(args[i]);
			
		}
		
		System.out.println("The total is " + sum);
		
	}

}
