
public class ex7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double pi;
		double num = 0;
		int flag = 1;
		for(int i = 1;i <= 13;i += 2)
		{
			double num1 = 1.0/i;
			num += num1 * flag;
			flag = flag * (-1);	
		}
		pi = 4 * num;
		System.out.println("pi = " + pi);

	}

}
